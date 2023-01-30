package com.softserve.edu.homework07.task2;

public class Bus extends GroundVehicle {

    String route;

    Bus(){}

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        super.drive();
    }
}
