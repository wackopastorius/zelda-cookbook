package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.model.VegetarianRecipe;
import com.lad666.zeldabackend.repository.VegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegService implements VegServiceImpl {
    @Autowired
    private VegRepository vegRepository;
    @Override
    public List<VegetarianRecipe> getAllVegRecipes() {
        return vegRepository.findAll();
    }
}
