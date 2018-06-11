package com.example.coffeeworld;

import com.example.coffeeworld.POJO.*;
import com.example.coffeeworld.Service.AccountService;
import com.example.coffeeworld.Service.CoffeeService;
import com.example.coffeeworld.Service.ReceipeService;
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
    @Autowired
    private ReceipeService recipeSevice;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeworldApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Account account = new Account("1", "Marek", "Roskowicz", "rozek1997", "marek@", "trol");
        Account account1 = new Account("2", "Adam", "Woznaikowski", "adas1234", "adam@", "trol");
        Account account2 = new Account("3", "Bartek", "Rzyszkiewicz", "batek1996", "bartek@", "trol");

        Coffee coffee = new Coffee("1",account, "Kafa1", "wczoraj",100,"Java","Natural","Kenia", BeanType.ARABICA);
        Coffee coffee1 = new Coffee("2",account, "Kafa2", "dzis",200,"CR","Washed","Columbia", BeanType.BLEND);
        Coffee coffee2 = new Coffee("3",account, "Kafa3", "jutro",300,"FH","Pulped Natural","San Salvador xD", BeanType.ROBUSTA);
        Coffee coffee3 = new Coffee("4", account, "Kafa4", "pojutrze", 300, "FH", "Pulped Natural", "San Salvador xD", BeanType.ROBUSTA);


        Recipe recipe = new Recipe("1",Method.AEROPRESS, 18,300,92,"kwasowa","coarse",2.3,coffee,account);
        Recipe recipe1 = new Recipe("2",Method.CHEMEX, 30,500,94,"herbaciana","medium coarse",2.4,coffee1,account1);
        Recipe recipe2 = new Recipe("3",Method.V60, 15,250,87,"szybka kawka","fine",2.5,coffee2,account2);


        List<Coffee> coffees = Arrays.asList(coffee, coffee1, coffee2, coffee3);
        coffeeService.addCoffee(coffee);
        coffeeService.addCoffee(coffee1);
        coffeeService.addCoffee(coffee2);
        recipeSevice.addRecipe(recipe);
        recipeSevice.addRecipe(recipe1);
        recipeSevice.addRecipe(recipe2);
        accountService.updateCoffees(coffees);


        List<Account> accounts = Arrays.asList(account, account1, account2);
        accountService.updateAllUser(accounts);
        account1.setEmail("adas3456");
        accountService.updateUser(account1);

    }
}
