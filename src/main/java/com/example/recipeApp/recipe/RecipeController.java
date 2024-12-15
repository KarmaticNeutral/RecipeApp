package com.example.recipeApp.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/recipe")
public class RecipeController {

    private final RecipeService _recipeService;

    public RecipeController(RecipeService recipeService) {
        this._recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getRecipes() {
        return _recipeService.getRecipes();
    }
}
