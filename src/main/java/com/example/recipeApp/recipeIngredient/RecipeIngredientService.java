package com.example.recipeApp.recipeIngredient;

import com.example.recipeApp.recipe.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientService {
    private final RecipeIngredientRepository _recipeIngredientRepository;

    public RecipeIngredientService(RecipeIngredientRepository recipeIngredientRepository, RecipeRepository recipeRepository) {
        this._recipeIngredientRepository = recipeIngredientRepository;
    }

    public RecipeIngredient getRecipeIngredientById(int id) {
        return _recipeIngredientRepository.findById(id);
    }

    public List<RecipeIngredient> getRecipeIngredientByRecipeId(Integer id) {
        return _recipeIngredientRepository.findByRecipeId(id);
    }

    public RecipeIngredient create(RecipeIngredient recipeIngredient) {
        return _recipeIngredientRepository.save(recipeIngredient);
    }
}
