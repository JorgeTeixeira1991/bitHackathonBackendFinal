package com.example.MenuFood.Repository;

import com.example.MenuFood.Model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientDAO extends JpaRepository <Ingredient, Long> {
    List<Ingredient> findAllByName(String name);
}
