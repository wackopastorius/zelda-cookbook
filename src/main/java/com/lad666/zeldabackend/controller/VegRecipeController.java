package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.exception.ResourceNotFoundException;
import com.lad666.zeldabackend.model.VegetarianRecipe;
import com.lad666.zeldabackend.service.VegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class VegRecipeController {
    //properties
    @Autowired
    private VegService vegService;

    //constructors
    public VegRecipeController(VegService vegService) {
        this.vegService = vegService;
    }

    //requests
    @GetMapping("/vegrecipes")
    public List<VegetarianRecipe> getAllVegRecipes() {
        return vegService.getAllVegRecipes();
    }

    @PutMapping("/vegrecipes/likes/{id}")
    public ResponseEntity<VegetarianRecipe> updateLikesForRecipe(@PathVariable("id") int id, @RequestBody VegetarianRecipe vegetarianRecipe) throws ResourceNotFoundException {
        return ResponseEntity.ok(vegService.updateLikesForRecipe(vegetarianRecipe, id));
    }
}
