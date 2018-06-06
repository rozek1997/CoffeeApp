package com.example.coffeeworld.POJO;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "coffee")
public class Coffee {

    @Id
    private String ID;
    @JsonIgnore
    private Account account;
    private String coffeeName;
    private Date roastDate;
    private int metresAboveSeaLevel;
    private String roastery;
    private String process;
    private String origin;
    private BeanType beanType;
    private String username;

    public Coffee() {
    }

    public Coffee(String ID, Account account, String coffeeName, Date roastDate, int metresAboveSeaLevel, String roastery,
                  String process, String origin, BeanType beanType) {
        this.ID = ID;
        this.account = account;
        this.coffeeName = coffeeName;
        this.username = account.getUsername();
        this.roastDate = roastDate;
        this.metresAboveSeaLevel = metresAboveSeaLevel;
        this.roastery = roastery;
        this.process = process;
        this.origin = origin;
        this.beanType = beanType;
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

    public Date getRoastDate() {
        return roastDate;
    }

    public void setRoastDate(Date roastDate) {
        this.roastDate = roastDate;
    }

    public int getMetresAboveSeaLevel() {
        return metresAboveSeaLevel;
    }

    public void setMetresAboveSeaLevel(int metresAboveSeaLevel) {
        this.metresAboveSeaLevel = metresAboveSeaLevel;
    }

    public String getRoastery() {
        return roastery;
    }

    public void setRoastery(String roastery) {
        this.roastery = roastery;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public BeanType getBeanType() {
        return beanType;
    }

    public void setBeanType(BeanType beanType) {
        this.beanType = beanType;
    }
}
