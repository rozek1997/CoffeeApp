package com.example.coffeeworld;

import com.example.coffeeworld.POJO.Account;
import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.AccountService;
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
    @Autowired
    private AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeworldApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Account account = new Account("1", "Marek", "Roskowicz", "rozek1997", "marek@", "trol");
        Account account1 = new Account("2", "Adam", "Woznaikowski", "adas1234", "adam@", "trol");
        Account account2 = new Account("3", "Bartek", "Rzyszkiewicz", "batek1996", "bartek@", "trol");

        Coffee coffee = new Coffee("1", account, "kafa");
        Coffee coffee1 = new Coffee("2", account1, "Kafa2");
        Coffee coffee2 = new Coffee("3", account2, "kafa3");

        List<Coffee> coffees = Arrays.asList(coffee, coffee1, coffee2);
        accountService.updateCoffees(coffees);


        List<Account> accounts = Arrays.asList(account, account1, account2);
        accountService.updateAllUser(accounts);
        account1.setEmail("adas3456");
        accountService.updateUser(account1);

    }
}
