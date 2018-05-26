package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;
import com.example.coffeeworld.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/information/{id}")
    public Optional<User> userInformation(@PathVariable String id) {
        return userService.findUserInformation(id);
    }

    @GetMapping("/{nickname}")
    public User findUserByNick(@PathVariable String nickname) {
        return userService.findUserByNick(nickname);
    }

    @GetMapping("/mycoffee/{userID}")
    public List<Coffee> myCoffees(@PathVariable String userID) {
        List<Coffee> coffeeList = userService.myCoffees(userID);
        return coffeeList;
    }

}
