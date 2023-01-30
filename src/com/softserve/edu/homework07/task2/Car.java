package com.softserve.edu.homework07.task2;

public class Car extends GroundVehicle {
    String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        super.drive();
    }
}
