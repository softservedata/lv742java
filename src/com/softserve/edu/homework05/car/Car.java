package com.softserve.edu.homework05.car;

public class Car {
    private String type;
    private int prodYear;
    private int engineCapacity;

    public Car(){}

    public Car(String type, int prodYear, int engineCapacity) {
        this.type = type;
        this.prodYear = prodYear;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getProdYear() {
        return prodYear;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", prodYear=" + prodYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }


}
