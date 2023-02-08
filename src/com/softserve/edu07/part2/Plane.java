package com.softserve.edu07.part2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(){

    }

    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }

    @Override
    public void land() {
        System.out.println("Plane can land");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

}
