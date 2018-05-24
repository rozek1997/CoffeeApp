package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;

import java.util.List;

public interface CoffeeServiceInterface {


    List<Coffee> findAllCoffee();

    void saveCoffee(List<Coffee> coffees);
}
