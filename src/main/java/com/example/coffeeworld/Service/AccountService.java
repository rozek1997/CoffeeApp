package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Account;
import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Repository.AccountRepository;
import com.example.coffeeworld.Repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class AccountService implements AccountServiceInterface {

    @Autowired
    private CoffeeRepository coffeeRepository;
    @Autowired
    private AccountRepository accountRepository;


    @Override
    public Optional<Account> findUserByUsername(String username) {
        return accountRepository.findUserByUsername(username);
    }

    public Optional<Account> findUserByID(String id) {
        return accountRepository.findById(id);
    }

    @Override
    public void insertUser(Account account) {
        accountRepository.insert(account);
    }

    @Override
    public void updateUser(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void updateAllUser(List<Account> accountList) {
        accountRepository.saveAll(accountList);
    }

    @Override
    public void insertAllUser(List<Account> accountList) {
        accountRepository.insert(accountList);
    }

    @Override
    public List<Coffee> displayListOfCoffees(String username) {
        return coffeeRepository.findCoffeesByAccount_Username(username);
    }

    @Override
    public void updateCoffees(List<Coffee> coffees) {
        coffeeRepository.saveAll(coffees);
    }

    @Override
    public void updateCoffee(Coffee coffee) {
        coffeeRepository.save(coffee);
    }

    @Override
    public void deleteCoffeById(String id) {
        coffeeRepository.deleteById(id);
    }
}
