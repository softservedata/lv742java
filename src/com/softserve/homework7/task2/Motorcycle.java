package com.softserve.homework7.task2;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }
}
