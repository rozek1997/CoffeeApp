package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {


    public Optional<User> findUserInformation(String id);

    public User findUserByNick(String nickname);

    public void insertUser(User user);

    public void updateUser(User user);

    public void updateAllUser(List<User> userList);

    public void insertAllUser(List<User> userList);

    public List<Coffee> displayListOfCoffees(String userID);

    public void updateCoffees(List<Coffee> coffees);

    public void updateCoffee(Coffee coffee);

    public void deleteCoffeById(String id);

}
