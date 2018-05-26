package com.example.coffeeworld.POJO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;

@Document(collection = "coffee")
public class Coffee {

    @Id
    private String ID;
    private String userID;
    private String coffeeName;

    public Coffee() {
    }

    public Coffee(String ID, String userID, String coffeeName) {
        this.ID = ID;
        this.userID = userID;
        this.coffeeName = coffeeName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
