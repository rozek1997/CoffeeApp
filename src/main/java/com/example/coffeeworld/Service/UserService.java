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
    public Optional<Coffee> findCoffeeById(String id) {
        return coffeeRepository.findById(id);
    }

    @Override
    public void deleteCoffeById(String id) {
        coffeeRepository.deleteById(id);
    }

    @Override
    public Optional<User> findUserInformation(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUsers(List<User> user) {
        userRepository.saveAll(user);
    }

    @Override
    public User findUserByNick(String nickname) {
        return userRepository.findUserByNickname(nickname);
    }

    @Override
    public List<Coffee> myCoffees(String userID) {
        return coffeeRepository.findAllByUserID(userID);
    }

}
