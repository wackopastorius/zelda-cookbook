package com.lad666.zeldabackend.repository;

import com.lad666.zeldabackend.model.MeatRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeatRepository extends JpaRepository<MeatRecipe, Integer> {
}
