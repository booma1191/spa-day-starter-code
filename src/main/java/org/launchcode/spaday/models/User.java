package org.launchcode.spaday.models;

import java.util.Date;

public class User {
    // username, email, password
    private static int nextId = 1;

    private int id;
    private String username;
    private String email;
    private String password;
    private final Date joinedDate;

    // Construtor
    public User() {
        id = nextId;
        nextId++;
        this.joinedDate = new Date();
    }

    // Getters & Setters

    public int getId() { return this.id; }

    public Date getJoinedDate() { return this.joinedDate; }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
