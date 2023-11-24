package com.lad666.zeldabackend.repository;

import com.lad666.zeldabackend.model.SeafoodRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeafoodRepository extends JpaRepository<SeafoodRecipe, Integer> {
}
