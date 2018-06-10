package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
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

    @RequestMapping(value = "/coffee", method = RequestMethod.POST)
    public void addNewCoffee(Coffee coffee){
        coffeeService.addCoffee(coffee);
    }


}
