package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.MeatRecipe;
import com.lad666.zeldabackend.service.MeatService;
import com.lad666.zeldabackend.util.JWTHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MeatRecipeController {
    @Autowired
    private MeatService meatService;

    //requests
    @PostMapping("/meatrecipes")
    public List<MeatRecipe> getAllMeatRecipes(@RequestHeader(value = "Authorization", required = true) String token) {
        return meatService.getAllMeatRecipes(token.split(" ")[1]);
    }
}
