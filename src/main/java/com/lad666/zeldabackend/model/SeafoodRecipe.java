package com.lad666.zeldabackend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "seafood_recipe")
public class SeafoodRecipe {

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

    public SeafoodRecipe(int id, String name, String imageURL, UUID uuid) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.uuid = UUID.randomUUID();
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
