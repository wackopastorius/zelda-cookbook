package com.lad666.zeldabackend.util;

import com.lad666.zeldabackend.model.User;
import org.springframework.util.DigestUtils;

public class AuthTool {
    public static boolean validateUser(User user, String password){
        return DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword());
    }
}
