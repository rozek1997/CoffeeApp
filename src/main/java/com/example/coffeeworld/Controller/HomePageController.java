package com.example.coffeeworld.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
public class HomePageController {

    /**
     * displays home Page
     * @return html file "index"
     */
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
}
