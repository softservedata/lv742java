package com.softserve.edu07.part2;

public class Car extends GroundVehicle{
    private String model;

    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car can drive");
    }
}
