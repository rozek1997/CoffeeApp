package com.example.coffeeworld;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CoffeeworldApplication implements CommandLineRunner {

    @Autowired
    private CoffeeService coffeeService;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeworldApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Coffee coffee = new Coffee("1", "kafa");
        Coffee coffee1 = new Coffee("2", "Kafa2");
        Coffee coffee2 = new Coffee("3", "kafa3");

        List<Coffee> coffees = Arrays.asList(coffee, coffee1, coffee2);
        coffeeService.saveCoffees(coffees);
    }
}
