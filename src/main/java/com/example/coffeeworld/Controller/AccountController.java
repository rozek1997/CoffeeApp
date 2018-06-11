package com.example.coffeeworld.Controller;


import com.example.coffeeworld.POJO.Account;
import com.example.coffeeworld.POJO.Coffee;
import com.example.coffeeworld.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

//import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * controller used to handle requests about user
 */
@CrossOrigin
@RestController
@RequestMapping("/user/{username}")
public class AccountController {

    //TODO://ADD JAVADOC COMMENTS TO SE WHAT IS DONE
    //TODO://ADD user recipe to account controler


    /**
     * serviced used to connect with account repository
     */
    @Autowired
    private AccountService accountService;

    /**
     * Method used to get user's information
     * @param username defines exact username
     * @return Account details
     */
    @GetMapping("/information")
    public Optional<Account> userInformation(@PathVariable String username) {
        //validateUser(username);
        return accountService.findUserByUsername(username);
    }


    /**
     * Displays all coffees assigned to particular user
     * @param username defines user
     * @return list of coffees
     */
    @GetMapping("/mycoffee")
    public List<Coffee> displayUserCoffees(@PathVariable String username) {
        //validateUser(username);
        List<Coffee> coffeeList = accountService.displayListOfCoffees(username);
        return coffeeList;
    }

    /**
     * Removes coffee
     * @param id coffee identifier
     * @param username  username identifier(validation)
     * @param response  object for response
     * @throws IOException
     */
    @DeleteMapping("/remove?q={id}")
    public void removeCoffeeByID(@PathVariable String id, @PathVariable String username, HttpServletResponse response) throws IOException {
        //validateUser(username);
        accountService.deleteCoffeById(id);
        response.sendRedirect("/coffee/");
    }


    /**
     * @param username use for idetify username
     */

    private void validateUser(String username) throws UsernameNotFoundException {
        Optional<Account> account = this.accountService.findUserByUsername(username);
        if (account == null)
            throw new UsernameNotFoundException(username);
    }


}
