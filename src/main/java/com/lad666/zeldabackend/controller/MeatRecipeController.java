package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.MeatRecipe;
import com.lad666.zeldabackend.service.MeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MeatRecipeController {
    @Autowired
    private MeatService meatService;

    //requests
    @GetMapping("/meatrecipes")
    public List<MeatRecipe> getAllMeatRecipes() {
        return meatService.getAllMeatRecipes();
    }
}
