package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/coffeeList")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    public String coffeeList(Model model) {
        List<Coffee> coffeeList = coffeeService.findAllCoffee();
        model.addAttribute("coffee", coffeeList);
        return "coffee";
    }
}
