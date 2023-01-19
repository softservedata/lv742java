package com.softserve.homework7.task2;

public abstract class GroundVehicle implements Vehicle {

    private Passengers passengers;

    public GroundVehicle() {
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public abstract void drive();

}
