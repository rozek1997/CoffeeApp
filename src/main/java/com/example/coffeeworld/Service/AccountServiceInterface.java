package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Account;
import com.example.coffeeworld.POJO.Coffee;

import java.util.List;
import java.util.Optional;

public interface AccountServiceInterface {

    public Optional<Account> findUserByUsername(String username);

    public void insertUser(Account account);

    public void updateUser(Account account);

    public void updateAllUser(List<Account> accountList);

    public void insertAllUser(List<Account> accountList);

    public List<Coffee> displayListOfCoffees(String username);

    public void updateCoffees(List<Coffee> coffees);

    public void updateCoffee(Coffee coffee);

    public void deleteCoffeById(String id);

}
