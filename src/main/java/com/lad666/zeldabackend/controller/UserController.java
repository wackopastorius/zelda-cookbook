package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.User;
import com.lad666.zeldabackend.model.VegetarianRecipe;
import com.lad666.zeldabackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    //constructors
    public UserController() {
    }
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //requests
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
