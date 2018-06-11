package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;

import java.util.List;
import java.util.Optional;

/**
 * coffee service interface
 */
public interface CoffeeServiceInterface {


    public List<Coffee> findAllCoffee();

    public Optional<Coffee> findCoffeeByCoffeeName(String coffeeName);

    public void addCoffee(Coffee coffee);


}
