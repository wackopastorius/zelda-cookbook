package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.exception.ResourceNotFoundException;
import com.lad666.zeldabackend.model.VegetarianRecipe;

import java.util.List;

public interface VegServiceImpl {
    List<VegetarianRecipe> getAllVegRecipes();

    VegetarianRecipe updateLikesForRecipe(VegetarianRecipe recipe, int id) throws ResourceNotFoundException;
}
