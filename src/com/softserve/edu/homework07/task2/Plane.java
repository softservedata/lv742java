package com.softserve.edu.homework07.task2;

public class Plane extends FlyingVehicle{
    int maxDistance;

    Plane(){}

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void land() {
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
