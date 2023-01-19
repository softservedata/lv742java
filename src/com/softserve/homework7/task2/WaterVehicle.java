package com.softserve.homework7.task2;

public abstract class WaterVehicle implements Vehicle{

    private Passengers passengers;

    public WaterVehicle() {
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public abstract void isSailing();
}
