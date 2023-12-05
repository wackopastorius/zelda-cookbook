package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.exception.ResourceNotFoundException;
import com.lad666.zeldabackend.model.AuthRequest;
import com.lad666.zeldabackend.model.User;
import com.lad666.zeldabackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {
    @Autowired
    private AuthService authService;

    // Loggar in, token fanns ej tillgängligt på enhet som kör frontend
    // Behöver nu validera uppgifter och returnera en token
    @PostMapping("/get_token")
    public ResponseEntity<String> getToken(@RequestBody AuthRequest authRequest) {
        try {
            return ResponseEntity.ok(authService.getValidatedUser(authRequest));
        } catch (ResourceNotFoundException e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
    }
    // Token finns, behöver nu kolla om den är giltig
    @PostMapping("/validate_token")
    public ResponseEntity<User> returnUserDataIfValidToken(@RequestBody User user){
    return new ResponseEntity("sd", HttpStatus.FORBIDDEN);
    }


/*    @PostMapping("/signin")
    public ResponseEntity<User> getAuthorizedUser(@RequestBody AuthRequest authRequest) {
        try {
            return ResponseEntity.ok(authService.getValidatedUser(authRequest));
        } catch (ResourceNotFoundException e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
    }*/
}
