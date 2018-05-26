package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.POJO.User;
import com.example.coffeeworld.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    //TODO://ADD JAVADOC COMMENTS TO SE WHAT IS DONE


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
    public List<Coffee> displayUserCoffees(@PathVariable String userID) {
        List<Coffee> coffeeList = userService.displayListOfCoffees(userID);
        return coffeeList;
    }

    @DeleteMapping("/{id}")
    public void removeCoffeeByID(@PathVariable String id, HttpServletResponse response) throws IOException {
        userService.deleteCoffeById(id);
        response.sendRedirect("/coffee/");
    }

}
