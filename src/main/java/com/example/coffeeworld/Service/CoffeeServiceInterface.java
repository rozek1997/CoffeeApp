package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeServiceInterface {


    public List<Coffee> findAllCoffee();

    public void saveCoffees(List<Coffee> coffees);

    public Optional<Coffee> findCoffeeById(String id);

    public void deleteCoffeById(String id);


}
