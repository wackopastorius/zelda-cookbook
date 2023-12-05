package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.exception.ForbiddenException;
import com.lad666.zeldabackend.model.MeatRecipe;
import com.lad666.zeldabackend.repository.MeatRepository;
import com.lad666.zeldabackend.util.JWTHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeatService implements MeatServiceImpl{
    //properties
    @Autowired
    private MeatRepository meatRepository;

    //CRUD
    public List<MeatRecipe> getAllMeatRecipes(String token) {
        if(JWTHandler.validatedToken(token)){
            return meatRepository.findAll();
        }
        throw new ForbiddenException("Token", token);
    }
}
