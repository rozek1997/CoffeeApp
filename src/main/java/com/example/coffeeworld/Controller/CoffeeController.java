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


    /**
     * displays list of coffees
     * @return  list of coffees
     */
    @GetMapping("/")
    public List<Coffee> coffeeList() {
        List<Coffee> coffeeList = coffeeService.findAllCoffee();
        return coffeeList;
    }

    /**
     * displays particular coffee
     * @param coffeeName name of coffee
     * @return coffee instance
     */
    @GetMapping("/{coffeeName}")
    public Optional<Coffee> findCoffeeByName(@PathVariable String coffeeName) {
        return coffeeService.findCoffeeByCoffeeName(coffeeName);
    }

    /**
     * adds new coffee
     * @param coffee informations about coffee to be added
     */
    @RequestMapping(value = "/coffee", method = RequestMethod.POST)
    public void addNewCoffee(Coffee coffee){
        coffeeService.addCoffee(coffee);
    }


}
