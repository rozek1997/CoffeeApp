package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/")
    public List<Coffee> coffeeList() {
        List<Coffee> coffeeList = coffeeService.findAllCoffee();
        return coffeeList;
    }

    @GetMapping("/{coffeeName}")
    public Optional<Coffee> findCoffeeByName(@PathVariable String coffeeName) {
        return coffeeService.findCoffeeByCoffeeName(coffeeName);
    }


}
