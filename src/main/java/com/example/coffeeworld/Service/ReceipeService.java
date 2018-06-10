package com.example.coffeeworld.Service;


import com.example.coffeeworld.POJO.Recipe;
import com.example.coffeeworld.Repository.ReceipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class ReceipeService {
    @Autowired
    ReceipeRepository receipeRepository;

    /**
     * adds recipe
     * @param recipe
     */
    public void addRecipe(Recipe recipe){
        receipeRepository.save(recipe);
    }

    /**
     * returns recipe with particular id
     * @param id
     * @return recipe
     */
    public Optional getRecipeById(String id){
        return receipeRepository.findById(id);
    }

    /**
     * returns all recipes
     * @return list of recipes
     */
    public List<Recipe> getAllRecipes(){
        return receipeRepository.findAll();
    }

    /**
     * returns all users recipes
     * @param id
     * @return list of coffees
     */
    public Optional<Recipe> getAllRecipesByUser(String id){
        return receipeRepository.findRecipesByUserId(id);
    }

    /**
     * returns all coffees assigned to particular coffee
     * @param id
     * @return list of recipes
     */
    public Optional<Recipe> getAllRecipesByCoffee(String id){
        return receipeRepository.findRecipesByCoffeeID(id);
    }
}
