package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.model.SeafoodRecipe;
import com.lad666.zeldabackend.repository.SeafoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeafoodService implements SeafoodServiceImpl{
    //properties
    @Autowired
    private SeafoodRepository seafoodRepository;
    @Override
    public List<SeafoodRecipe> getAllSeafoodRecipes() {
        return seafoodRepository.findAll();
    }
}
