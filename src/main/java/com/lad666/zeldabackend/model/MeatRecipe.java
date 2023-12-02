package com.lad666.zeldabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "meat_recipe")
public class MeatRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "recipe_name")
    private String name;

    @Column(name = "image_url")
    private String imageURL;

    public MeatRecipe() {
    }

    public MeatRecipe(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public MeatRecipe(int id, String name, String imageURL) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
