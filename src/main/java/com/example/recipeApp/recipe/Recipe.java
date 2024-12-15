package com.example.recipeApp.recipe;

import com.example.recipeApp.recipeIngredient.RecipeIngredient;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Recipe {
    @Id
    @SequenceGenerator(
        name = "recipe_sequence",
        sequenceName = "recipe_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "recipe_sequence"
    )
    private Integer id;
    private String name;
    private String description;

    @OneToMany
    private List<RecipeIngredient> recipesIngredients;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<RecipeIngredient> getRecipesIngredients() { return recipesIngredients; }

    public void setRecipesIngredients(List<RecipeIngredient> recipesIngredients) { this.recipesIngredients = recipesIngredients; }

    public Recipe() {}

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Recipe(String name, String description, Integer id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }
}