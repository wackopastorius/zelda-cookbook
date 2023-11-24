package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.VegetarianRecipe;
import com.lad666.zeldabackend.service.VegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VegRecipeController {
    //properties
    @Autowired
    private VegService vegService;

    //controller
    public VegRecipeController(VegService vegService) {
        this.vegService = vegService;
    }

    //requests
    @GetMapping("/vegrecipes")
    public List<VegetarianRecipe> getAllVegRecipes() {
        return vegService.getAllVegRecipes();
    }
}
