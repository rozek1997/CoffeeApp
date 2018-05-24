package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class CoffeeService implements CoffeeServiceInterface {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> findAllCoffee() {
        return coffeeRepository.findAll();
    }

    public void saveCoffees(List<Coffee> coffees) {
        coffeeRepository.saveAll(coffees);
    }

    public Optional<Coffee> findCoffeeById(String id) {
        return coffeeRepository.findById(id);
    }

    @Override
    public void deleteCoffeById(String id) {
        coffeeRepository.deleteById(id);
    }
}
