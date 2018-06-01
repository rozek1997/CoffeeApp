package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceipeRepository extends MongoRepository<Recipe, String> {
}
