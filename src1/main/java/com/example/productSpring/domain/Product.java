package com.example.productSpring.domain;

public class Product {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        id = id + 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
