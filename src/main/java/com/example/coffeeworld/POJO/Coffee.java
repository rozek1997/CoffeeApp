package com.example.coffeeworld.POJO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coffee")
public class Coffee {

    @Id
    String id;
    String coffeeName;

    public Coffee(String id, String coffeeName) {
        this.id = id;
        this.coffeeName = coffeeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
}
