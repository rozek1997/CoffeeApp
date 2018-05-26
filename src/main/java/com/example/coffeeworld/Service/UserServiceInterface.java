package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    public Optional<Coffee> findCoffeeById(String id);

    public void deleteCoffeById(String id);

    public Optional<User> findUserInformation(String id);

    public void saveUsers(List<User> user);

    public User findUserByNick(String nickname);

    public List<Coffee> myCoffees(String userID);
}
