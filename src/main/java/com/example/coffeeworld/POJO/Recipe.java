package com.example.coffeeworld.POJO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipe")
public class Recipe {

    @Id
    private String id;
    @JsonIgnore
    private Coffee coffee;
    private Method method;
    private double coffeeWeight;
    private double waterAmount;
    private int waterTemperature;
    private String description;
    private String grinding;
    private double tds;
    private String roasteryName;
    private String origin;

    public Recipe() {

    }

    public Recipe(String id, Method method, double coffeeWeight, double waterAmount, int waterTemperature,
                  String description, String grinding, double tds, Coffee coffee) {
        this.id = id;
        this.method = method;
        this.coffeeWeight = coffeeWeight;
        this.waterAmount = waterAmount;
        this.waterTemperature = waterTemperature;
        this.description = description;
        this.grinding = grinding;
        this.tds = tds;
        this.roasteryName = coffee.getRoastery();
        this.origin = coffee.getOrigin();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public double getCoffeeWeight() {
        return coffeeWeight;
    }

    public void setCoffeeWeight(double coffeeWeight) {
        this.coffeeWeight = coffeeWeight;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGrinding() {
        return grinding;
    }

    public void setGrinding(String grinding) {
        this.grinding = grinding;
    }

    public double getTds() {
        return tds;
    }

    public void setTds(double tds) {
        this.tds = tds;
    }

    public String getRoasteryName() {
        return roasteryName;
    }

    public void setRoasteryName(String roasteryName) {
        this.roasteryName = roasteryName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
