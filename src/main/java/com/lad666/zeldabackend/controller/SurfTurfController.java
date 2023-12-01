package com.lad666.zeldabackend.controller;

import com.lad666.zeldabackend.model.SurfTurfRecipe;
import com.lad666.zeldabackend.service.SurfTurfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SurfTurfController {
    //properties
    @Autowired
    private SurfTurfService surfTurfService;

    //controller
    public SurfTurfController(SurfTurfService surfTurfService) {
        this.surfTurfService = surfTurfService;
    }

    //requests
    @GetMapping("/surfturfrecipes")
    public List<SurfTurfRecipe> getAllSurfTurfRecipes() {
        return surfTurfService.getAllSurfTurfRecipes();
    }
}
