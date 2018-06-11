package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * recipe repository
 */
@Repository
public interface ReceipeRepository extends MongoRepository<Recipe, String> {
    public Optional<Recipe> findRecipesByCoffeeID(String id);

    public Optional<Recipe> findRecipesByUserId(String id);
}
