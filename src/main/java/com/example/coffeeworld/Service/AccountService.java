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

/**
 * account service implementation
 */
@Service
@Component
public class AccountService implements AccountServiceInterface {

    @Autowired
    private CoffeeRepository coffeeRepository;
    @Autowired
    private AccountRepository accountRepository;


    /**
     * returns user by username
     * @param username
     * @return user
     */
    @Override
    public Optional<Account> findUserByUsername(String username) {
        return accountRepository.findUserByUsername(username);
    }

    /**
     * returns user by id
     * @param id
     * @return user
     */
    public Optional<Account> findUserByID(String id) {
        return accountRepository.findById(id);
    }

    /**
     * iserts account
     * @param account
     */
    @Override
    public void insertUser(Account account) {
        accountRepository.insert(account);
    }

    /**
     * updates user info
     * @param account
     */
    @Override
    public void updateUser(Account account) {
        accountRepository.save(account);
    }

    /**
     * updates users list
     * @param accountList
     */
    @Override
    public void updateAllUser(List<Account> accountList) {
        accountRepository.saveAll(accountList);
    }

    /**
     * inserts all users
     * @param accountList
     */
    @Override
    public void insertAllUser(List<Account> accountList) {
        accountRepository.insert(accountList);
    }

    /**
     * diplays list of coffees
     * @param username
     * @return
     */
    @Override
    public List<Coffee> displayListOfCoffees(String username) {
        return coffeeRepository.findCoffeesByAccount_Username(username);
    }

    /**
     * updates coffees assigned to user
     * @param coffees
     */
    @Override
    public void updateCoffees(List<Coffee> coffees) {
        coffeeRepository.saveAll(coffees);
    }

    /**
     * updates coffee assigned to user
     * @param coffee
     */
    @Override
    public void updateCoffee(Coffee coffee) {
        coffeeRepository.save(coffee);
    }

    /**
     * delets coffee by id
     * @param id
     */
    @Override
    public void deleteCoffeById(String id) {
        coffeeRepository.deleteById(id);
    }
}
