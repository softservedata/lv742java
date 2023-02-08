package com.softserve.edu07.part2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){

    }

    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }

    @Override
    public void land() {
        System.out.println("Helicopter can land");
    }
}
