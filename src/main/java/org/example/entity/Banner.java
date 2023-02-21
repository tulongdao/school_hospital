package org.example.entity;

import lombok.Data;

@Data
public class Banner {
    private Integer id;
    private String url;
    private String name;

    public Banner(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public Banner(Integer id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
    }
}
