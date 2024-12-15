package com.example.recipeApp.recipeIngredient;

import com.example.recipeApp.recipe.Recipe;
import jakarta.persistence.*;

@Entity
@Table
public class RecipeIngredient {
    @Id
    @SequenceGenerator(
            name = "recipe_ingredient_sequence",
            sequenceName = "recipe_ingredient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "recipe_ingredient_sequence"
    )
    private Integer id;
    private String name;
    private Integer quantity;
    private String unit;

    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public Recipe getRecipe() { return recipe; }
    public void setRecipe(Recipe recipe) { this.recipe = recipe; }

    public RecipeIngredient() { }

    public RecipeIngredient(String name, int quantity, String unit, Recipe recipe) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.recipe = recipe;
    }
}