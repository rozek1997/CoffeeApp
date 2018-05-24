package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;

import java.util.List;

public interface CoffeeServiceInterface {


    public List<Coffee> findAllCoffee();

    public void saveCoffees(List<Coffee> coffees);


}
