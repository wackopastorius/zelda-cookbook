package com.lad666.zeldabackend.service;

import com.lad666.zeldabackend.model.MeatRecipe;

import java.util.List;

public interface MeatServiceImpl {

    List<MeatRecipe> getAllMeatRecipes(String token);
}
