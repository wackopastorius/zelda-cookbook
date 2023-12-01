package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.SeafoodRecipe;
import com.lad666.zeldabackend.service.SeafoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class SeafoodRecipeController {
    //properties
    @Autowired
    private SeafoodService seafoodService;

    //constructors
    public SeafoodRecipeController(SeafoodService seafoodService) {
        this.seafoodService = seafoodService;
    }

    //requests
    @GetMapping("/seafoodrecipes")
    public List<SeafoodRecipe> getAllSeafoodRecipes() {

        System.out.println(seafoodService.getAllSeafoodRecipes());

        return seafoodService.getAllSeafoodRecipes();
    }
}
