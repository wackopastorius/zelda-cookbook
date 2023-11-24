package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.model.SurfTurfRecipe;
import com.lad666.zeldabackend.repository.SurfTurfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurfTurfService implements SurfTurfServiceImpl{
    //properties
    @Autowired
    private SurfTurfRepository surfTurfRepository;
    @Override
    public List<SurfTurfRecipe> getAllSurfTurfRecipes() {
        return surfTurfRepository.findAll();
    }
}
