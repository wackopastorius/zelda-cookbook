package com.lad666.zeldabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seafood_recipe")
public class SeafoodRecipe{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "recipe_name")
    private String name;

    @Column(name = "image_url")
    private String imageURL;

    public SeafoodRecipe(int id, String name, String imageURL) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
    }

    public SeafoodRecipe(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public SeafoodRecipe() {

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
