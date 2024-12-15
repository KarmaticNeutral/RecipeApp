package com.example.recipeApp.recipe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository _recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this._recipeRepository = recipeRepository;

        this._recipeRepository.save(new Recipe("Name", "Description"));
        this._recipeRepository.save(new Recipe("Name2", "Description2"));
    }

    public List<Recipe> getRecipes() {
        return this._recipeRepository.findAll();
    }
}
