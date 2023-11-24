package com.lad666.zeldabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="veg_recipe")
public class VegetarianRecipe extends Recipe{

    //constructors
    public VegetarianRecipe() {
    }

    public VegetarianRecipe(int id, String name) {
        super(id, name);
    }


}
