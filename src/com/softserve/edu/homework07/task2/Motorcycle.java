package com.softserve.edu.homework07.task2;

public class Motorcycle extends GroundVehicle {

    int maxSpeed;
    Motorcycle(){}

    @Override
    void drive() {
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
