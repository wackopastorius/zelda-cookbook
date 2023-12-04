package com.lad666.zeldabackend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="veg_recipe")
public class VegetarianRecipe {
    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "recipe_name")
    private String name;
    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name="likes_counter")
    private int likes;
    @Column(name="dislikes_counter")
    private int dislikes;

    //constructors
    public VegetarianRecipe() {
    }

    public VegetarianRecipe(int id, String name, String imageURL, UUID uuid, int likes, int dislikes) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.uuid = uuid;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    //get & set
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
