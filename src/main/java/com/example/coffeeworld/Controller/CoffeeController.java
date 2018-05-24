package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/")
    public List<Coffee> coffeeList(Model model) {
        List<Coffee> coffeeList = coffeeService.findAllCoffee();
        return coffeeList;
    }

    @GetMapping("/{id}")
    public Optional<Coffee> coffee(@PathVariable String id) {
        return coffeeService.findCoffeeById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void removeCoffee(@PathVariable String id) {
        coffeeService.deleteCoffeById(id);
    }


}
