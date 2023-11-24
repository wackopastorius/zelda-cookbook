package com.lad666.zeldabackend.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Recipe {
    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "recipe_name")
    private String name;

    //constructors
    public Recipe() {
    }

    public Recipe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters & setters
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

    //toString
    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
