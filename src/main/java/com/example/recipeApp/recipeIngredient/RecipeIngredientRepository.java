package com.example.recipeApp.recipeIngredient;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeIngredientRepository
       extends JpaRepository<RecipeIngredient, Long> {
    public RecipeIngredient findById(Integer id);
    public List<RecipeIngredient> findByRecipeId(Integer id);
}
