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

    /**
     * returns list of all coffees
     * @return list of coffees
     */
    @Override
    public List<Coffee> findAllCoffee() {
        return coffeeRepository.findAll();
    }

    /**
     * returns coffees by name
     * @param coffeeName
     * @return list of coffees
     */
    @Override
    public Optional<Coffee> findCoffeeByCoffeeName(String coffeeName) {
        return coffeeRepository.findCoffeeByCoffeeName(coffeeName);
    }

    /**
     * adds coffee
     * @param coffee info
     */
    @Override
    public void addCoffee(Coffee coffee){
        coffeeRepository.save(coffee);
    }

}
