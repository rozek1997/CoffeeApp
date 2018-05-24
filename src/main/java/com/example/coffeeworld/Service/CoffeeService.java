package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class CoffeeService implements CoffeeServiceInterface {

    @Autowired
    private CoffeeRepository coffeeRepository;

    @Override
    public List<Coffee> findAllCoffee() {
        return coffeeRepository.findAll();
    }

    @Override
    public void saveCoffee(List<Coffee> coffees) {
        coffeeRepository.saveAll(coffees);
    }
}
