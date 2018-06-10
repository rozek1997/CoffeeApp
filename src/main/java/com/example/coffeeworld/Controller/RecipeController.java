package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Recipe;
import com.example.coffeeworld.Service.ReceipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    ReceipeService receipeService;

    @RequestMapping(value = "/recipe/{recipeId}", method = RequestMethod.GET)
    public Optional getRecipeById(@PathVariable String recipeId){
        return receipeService.getRecipeById(recipeId);
    }


    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public void addRecipe(Recipe recipe){
        receipeService.addRecipe(recipe);
    }


    @RequestMapping(value = "/recipes",method = RequestMethod.GET)
    public List<Recipe> getAllRecipes(){
        return receipeService.getAllRecipes();
    }


    @RequestMapping(value = "/recipes/{UserId}", method = RequestMethod.GET)
    public Optional<Recipe> getUsersRecipes(@PathVariable String userId){
        return receipeService.getAllRecipesByUser(userId);
    }


    @RequestMapping(value = "/recipes/{coffeeId}",method = RequestMethod.GET)
    public Optional<Recipe> getAllCoffeeRecipes(@PathVariable String coffeeId){
        return receipeService.getAllRecipesByCoffee(coffeeId);
    }


}
