package com.example.recipeApp.recipeIngredient;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipeIngredient")
public class RecipeIngredientController {
    private final RecipeIngredientService _recipeIngredientService;

    public RecipeIngredientController(RecipeIngredientService recipeIngredientService) {
        this._recipeIngredientService = recipeIngredientService;
    }

    @GetMapping("{id}")
    public RecipeIngredient getById(@PathVariable Integer id) {
        return _recipeIngredientService.getRecipeIngredientById(id);
    }

    @GetMapping("/recipe/{recipeId}")
    public List<RecipeIngredient> getByRecipeId(@PathVariable Integer recipeId) {
        return _recipeIngredientService.getRecipeIngredientByRecipeId(recipeId);
    }

    @PostMapping
    public RecipeIngredient create(@RequestBody RecipeIngredient recipeIngredient) {
        return _recipeIngredientService.create(recipeIngredient);
    }
}
