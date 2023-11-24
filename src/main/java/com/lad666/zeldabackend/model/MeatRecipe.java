package com.lad666.zeldabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "meat_recipe")
public class MeatRecipe extends Recipe{

    //constructors
    public MeatRecipe() {
    }

    public MeatRecipe(int id, String name) {
        super(id, name);
    }
}
