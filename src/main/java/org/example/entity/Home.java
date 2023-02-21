package org.example.entity;

import lombok.Data;

@Data
public class Home {
    private String number;
    private String password;
    private Integer role;

    public Home(String number, String password, Integer role) {
        this.number = number;
        this.password = password;
        this.role = role;
    }
}
