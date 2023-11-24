package com.lad666.zeldabackend.repository;

import com.lad666.zeldabackend.model.VegetarianRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegRepository extends JpaRepository<VegetarianRecipe, Integer> {
}
