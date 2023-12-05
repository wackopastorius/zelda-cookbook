package com.lad666.zeldabackend.util;
// generate token
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

// verify token

import java.security.Key;
import java.util.Date;
public class JWTHandler { // singletonmönster passar här
    private static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    public static String generateToken(int userId){
        System.out.println("KEY: " + key);
        try {
            String jwt = Jwts.builder()
                    .setSubject("Token details")
                    .setIssuer("LiaToken")
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis()*3600000)) // 1 hour
                    .claim("userId", userId)
                    .signWith(key)
                    .compact();
            System.out.println("JWT: " + jwt);
            return jwt;
        } catch (IllegalArgumentException e){
            System.out.println("Nyckel eller påstående är null: " + e.getMessage());
        } catch (InvalidClaimException e){
            System.out.println("Något påstående för algoritm ogiltig: " + e.getMessage());
        } catch (JwtException e){
            System.out.println("Fel vid skapande av JWT: " + e.getMessage());
        }
        return null;
    }
    public static boolean validatedToken(String jwt){
        System.out.println("KEY: " + key);

        try {

            Jws<Claims> jws = Jwts
                    .parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(jwt);
            Claims claims = jws.getBody();
            String subject = claims.getSubject();
            String issuer = claims.getIssuer();
            Date issuedAt = claims.getIssuedAt(); // current time
            Date expiration = claims.getExpiration(); // 1 hour later
            int userId = claims.get("userId", Integer.class);
            return true;
        } catch (ExpiredJwtException e){
            System.out.println("Token expired");
        } catch (JwtException e){
            System.out.println("Not a valid token");
            System.out.println("Fel: " + e.getMessage());
        }
        return false;
    }
}
