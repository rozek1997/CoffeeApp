package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Recipe;

import java.util.Optional;

public interface RecipeServiceInterface {

    public void addRecipe(Recipe recipe);
    public Recipe getRecipeById(String id);
    public Optional<Recipe> getAllRecipes();
    public Optional<Recipe> getAllRecipesByUser(String id);
    public Optional<Recipe> getAllRecipesByCoffee(String id);


}
