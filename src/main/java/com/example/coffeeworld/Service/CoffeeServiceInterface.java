package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeServiceInterface {


    public List<Coffee> findAllCoffee();

    public Coffee findCoffeeByCoffeeName(String coffeeName);


}
