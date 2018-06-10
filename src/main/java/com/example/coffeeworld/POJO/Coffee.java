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
    private String roastDate;
    private int metresAboveSeaLevel;
    private String roastery;
    private String process;
    private String origin;
    private BeanType beanType;
    private String username;

    /**
     * cosntrucor
     */
    public Coffee() {
    }

    /**
     * constructor with params
     * @param ID
     * @param account
     * @param coffeeName
     * @param roastDate
     * @param metresAboveSeaLevel
     * @param roastery
     * @param process
     * @param origin
     * @param beanType
     */
    public Coffee(String ID, Account account, String coffeeName, String roastDate, int metresAboveSeaLevel, String roastery,
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

    /**
     * returns id
     * @return id
     */
    public String getID() {
        return ID;
    }

    /**
     * sets id
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * returns coffee name
     * @return coffeename
     */
    public String getCoffeeName() {
        return coffeeName;
    }

    /**
     * sets coffee name
     * @param coffeeName
     */
    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    /**
     * returns account
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * sets acoount
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * returns username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * sets username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * returns roast Date
     * @return roastDate
     */
    public String getRoastDate() {
        return roastDate;
    }

    /**
     * sets roast date
     * @param roastDate
     */
    public void setRoastDate(String roastDate) {
        this.roastDate = roastDate;
    }

    /**
     * returns masl attribute
     * @return metresAboveSeaLevel
     */
    public int getMetresAboveSeaLevel() {
        return metresAboveSeaLevel;
    }

    /**
     * sets masl
     * @param metresAboveSeaLevel
     */
    public void setMetresAboveSeaLevel(int metresAboveSeaLevel) {
        this.metresAboveSeaLevel = metresAboveSeaLevel;
    }

    /**
     * returns roastery name
     * @return roastery
     */
    public String getRoastery() {
        return roastery;
    }

    /**
     * sets roastery
     * @param roastery
     */
    public void setRoastery(String roastery) {
        this.roastery = roastery;
    }

    /**
     * returns process info
     * @return
     */
    public String getProcess() {
        return process;
    }

    /**
     * sets process info
     * @param process
     */
    public void setProcess(String process) {
        this.process = process;
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
     * returns bean type
     * @return
     */
    public BeanType getBeanType() {
        return beanType;
    }

    /**
     * sets bean type
     * @param beanType
     */
    public void setBeanType(BeanType beanType) {
        this.beanType = beanType;
    }
}
