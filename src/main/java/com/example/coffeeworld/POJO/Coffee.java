package com.example.coffeeworld.POJO;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coffee")
public class Coffee {

    @Id
    private String ID;
    @JsonIgnore
    private Account account;
    private String coffeeName;
    private String username;

    public Coffee() {
    }

    public Coffee(String ID, Account account, String coffeeName) {
        this.ID = ID;
        this.account = account;
        this.coffeeName = coffeeName;
        this.username = account.getUsername();
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

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
