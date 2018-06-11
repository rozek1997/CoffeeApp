package com.example.coffeeworld.POJO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * recipe entity
 */
@Document(collection = "recipe")
public class Recipe {

    @Id
    private String id;
    private Coffee coffee;
    @JsonIgnore
    private Account user;
    private Method method;
    private double coffeeWeight;
    private double waterAmount;
    private int waterTemperature;
    private String description;
    private String grinding;
    private double tds;
    private String roasteryName;
    private String origin;

    /**
     * constructor
     */
    public Recipe() {

    }

    /**
     * constructor with params
     * @param id
     * @param method
     * @param coffeeWeight
     * @param waterAmount
     * @param waterTemperature
     * @param description
     * @param grinding
     * @param tds
     * @param coffee
     * @param account
     */
    public Recipe(String id, Method method, double coffeeWeight, double waterAmount, int waterTemperature,
                  String description, String grinding, double tds, Coffee coffee, Account account) {
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
        this.user = account;
    }

    /**
     * returns id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * sets id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * returns coffee details
     * @return coffee
     */
    public Coffee getCoffee() {
        return coffee;
    }

    /**
     * sets coffee details
     * @param coffee
     */
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    /**
     * returns brewing method
     * @return method
     */
    public Method getMethod() {
        return method;
    }

    /**
     * sets brewing method
     * @param method
     */
    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * returns wieght of coffee
     * @return coffeeWeight
     */
    public double getCoffeeWeight() {
        return coffeeWeight;
    }

    /**
     * sets weight of coffee
     * @param coffeeWeight
     */
    public void setCoffeeWeight(double coffeeWeight) {
        this.coffeeWeight = coffeeWeight;
    }

    /**
     * returns amount of water
     * @return waterAmount
     */
    public double getWaterAmount() {
        return waterAmount;
    }

    /**
     * sets amount of water
     * @param waterAmount
     */
    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    /**
     * returns water temperature
     * @return waterTemperature
     */
    public int getWaterTemperature() {
        return waterTemperature;
    }

    /**
     * sets temperature of water
     * @param waterTemperature
     */
    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    /**
     * returns description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets descriptions
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * returns grinding details
     * @return grinding
     */
    public String getGrinding() {
        return grinding;
    }

    /**
     * sets grinding details
     * @param grinding
     */
    public void setGrinding(String grinding) {
        this.grinding = grinding;
    }

    /**
     * returns tds
     * @return tds
     */
    public double getTds() {
        return tds;
    }

    /**
     * sets tds
     * @param tds
     */
    public void setTds(double tds) {
        this.tds = tds;
    }

    /**
     * returns roastery name
     * @return roasteryName
     */
    public String getRoasteryName() {
        return roasteryName;
    }

    /**
     * sets sets roastery name
     * @param roasteryName
     */
    public void setRoasteryName(String roasteryName) {
        this.roasteryName = roasteryName;
    }

    /**
     * returns origin
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * sets origin
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * returns user
     * @return user
     */
    public Account getUser() {
        return user;
    }

    /**
     * sets user details
     * @param user
     */
    public void setUser(Account user) {
        this.user = user;
    }
}
