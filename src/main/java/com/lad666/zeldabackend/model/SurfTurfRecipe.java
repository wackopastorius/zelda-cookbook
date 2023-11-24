package com.lad666.zeldabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "surfturf_recipe")
public class SurfTurfRecipe extends Recipe {
    public SurfTurfRecipe() {
    }

    public SurfTurfRecipe(int id, String name) {
        super(id, name);
    }

}
