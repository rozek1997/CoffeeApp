package com.example.coffeeworld.Service;

import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;
import com.example.coffeeworld.Repository.CoffeeRepository;
import com.example.coffeeworld.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class UserService implements UserServiceInterface {

    @Autowired
    private CoffeeRepository coffeeRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<User> findUserInformation(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User findUserByNick(String nickname) {
        return userRepository.findUserByNickname(nickname);
    }

    @Override
    public void insertUser(User user) {
        userRepository.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateAllUser(List<User> userList) {
        userRepository.saveAll(userList);
    }

    @Override
    public void insertAllUser(List<User> userList) {
        userRepository.insert(userList);
    }

    @Override
    public List<Coffee> displayListOfCoffees(String userID) {
        return coffeeRepository.findAllByUserID(userID);
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
