package com.lad666.zeldabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "seafood_recipe")
public class SeafoodRecipe extends Recipe {

    //constructors
    public SeafoodRecipe() {
    }

    public SeafoodRecipe(int id, String name) {
        super(id, name);
    }
}
