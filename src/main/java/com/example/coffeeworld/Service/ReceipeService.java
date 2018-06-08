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

    public void addRecipe(Recipe recipe){
        receipeRepository.save(recipe);
    }
    public Optional getRecipeById(String id){
        return receipeRepository.findById(id);
    }
    public List<Recipe> getAllRecipes(){
        return receipeRepository.findAll();
    }
    public Optional<Recipe> getAllRecipesByUser(String id){
        return receipeRepository.findRecipesByUserId(id);
    }
    public Optional<Recipe> getAllRecipesByCoffee(String id){
        return receipeRepository.findRecipesByCoffeeID(id);
    }
}
