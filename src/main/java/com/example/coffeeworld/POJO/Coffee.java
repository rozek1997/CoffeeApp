package com.example.coffeeworld.POJO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Document(collection = "coffee")
public class Coffee {

    @Id
    @Min(value = 3)
    String id;
    String coffeeName;

    public Coffee() {
    }

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
