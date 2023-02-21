package org.example.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private String number;
    private String password;
    private Integer role;

    public User(String number, String password, Integer role) {
        this.number = number;
        this.password = password;
        this.role = role;
    }
}
