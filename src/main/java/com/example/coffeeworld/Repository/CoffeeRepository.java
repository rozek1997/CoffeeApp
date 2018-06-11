package com.example.coffeeworld.Repository;

import com.example.coffeeworld.POJO.Coffee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * coffee repository
 */
@Repository
public interface CoffeeRepository extends MongoRepository<Coffee, String> {


    public List<Coffee> findCoffeesByAccount_Username(String username);

    public Optional<Coffee> findCoffeeByCoffeeName(String coffeeName);


}
