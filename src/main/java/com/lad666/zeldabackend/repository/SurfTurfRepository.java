package com.lad666.zeldabackend.repository;

import com.lad666.zeldabackend.model.SurfTurfRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurfTurfRepository extends JpaRepository<SurfTurfRecipe, Integer> {
}
