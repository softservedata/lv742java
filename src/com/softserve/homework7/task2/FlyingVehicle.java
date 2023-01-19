package com.softserve.homework7.task2;

public abstract class FlyingVehicle implements Vehicle {

    private Passengers passengers;

    public FlyingVehicle() {
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public abstract void fly();

    public abstract void land();
}
