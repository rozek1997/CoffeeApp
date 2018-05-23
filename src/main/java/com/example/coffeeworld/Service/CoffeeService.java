package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> findAllCoffee() {
        return coffeeRepository.findAll();
    }

    public void saveCoffee(Coffee coffees) {
        coffeeRepository.save(coffees);
    }
}
