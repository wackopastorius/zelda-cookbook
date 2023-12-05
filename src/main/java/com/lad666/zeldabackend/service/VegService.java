package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.exception.ResourceNotFoundException;
import com.lad666.zeldabackend.model.VegetarianRecipe;
import com.lad666.zeldabackend.repository.VegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegService implements VegServiceImpl {
    @Autowired
    private VegRepository vegRepository;
    @Override
    public List<VegetarianRecipe> getAllVegRecipes() {
        return vegRepository.findAll();
    }

    @Override
    public VegetarianRecipe updateLikesForRecipe(VegetarianRecipe recipe, int id) throws ResourceNotFoundException {
            VegetarianRecipe chosenRecipe = vegRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("VegetarianRecipe", "Id", id));
            chosenRecipe.setLikes(recipe.getLikes());
            vegRepository.save(chosenRecipe);
            return chosenRecipe;
    }
}



