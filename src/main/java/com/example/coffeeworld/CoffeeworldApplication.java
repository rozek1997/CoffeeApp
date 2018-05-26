package com.example.coffeeworld;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;
import com.example.coffeeworld.Service.CoffeeService;
import com.example.coffeeworld.Service.UserService;
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
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeworldApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Coffee coffee = new Coffee("1", "3", "kafa");
        Coffee coffee1 = new Coffee("2", "2", "Kafa2");
        Coffee coffee2 = new Coffee("3", "2", "kafa3");

        List<Coffee> coffees = Arrays.asList(coffee, coffee1, coffee2);
        coffeeService.saveCoffees(coffees);

        User user = new User("1", "Marek", "Roskowicz", "rozek1997", "marek@", "trol");
        User user1 = new User("2", "Adam", "Woznaikowski", "adas1234", "adam@", "trol");
        User user2 = new User("3", "Bartek", "Rzyszkiewicz", "batek1996", "bartek@", "trol");

        List<User> users = Arrays.asList(user, user1, user2);
        userService.saveUsers(users);

    }
}
