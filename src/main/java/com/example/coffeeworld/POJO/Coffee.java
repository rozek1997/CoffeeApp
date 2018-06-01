package com.example.coffeeworld.POJO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coffee")
public class Coffee {

    @Id
    private String ID;
    private Account account;
    private String coffeeName;

    public Coffee() {
    }

    public Coffee(String ID, Account account, String coffeeName) {
        this.ID = ID;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }

    public void setUserID(Account account) {
        this.account = account;
    }
}
