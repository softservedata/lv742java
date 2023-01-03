package com.softserve.homework1;

public enum CountryPrice {

    USA(1.2),
    POLAND(1),
    GERMANY(1.1);


    private double price;

    CountryPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
