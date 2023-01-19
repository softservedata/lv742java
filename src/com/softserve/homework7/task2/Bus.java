package com.softserve.homework7.task2;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

}
