package com.example.coffeeworld.POJO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Document(collection = "user")
public class Account {

    @Id
    private String id;
    private String name;
    private String surname;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    @Min(value = 8)
    @Max(value = 24)
    private String password;


    /**
     * construcrot
     */
    public Account() {
    }

    /**
     * cosntructor
     * @param id
     * @param name
     * @param surname
     * @param username
     * @param email
     * @param password
     */
    public Account(String id, String name, String surname, String username, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
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
     * returns name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns surname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * sets surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
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
     * returns email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * returns password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
