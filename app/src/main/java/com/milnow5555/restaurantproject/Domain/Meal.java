package com.milnow5555.restaurantproject.Domain;


public class Meal {
    private String name;
    private String price;

    public Meal(String name, String price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
