package com.softserve.edu08a;

public abstract class ACar implements ICar {
    protected double maxSpeed;
    //private double maxSpeed;
    public static final String MESSAGE = "Hello";

    public ACar() {
        //super(); // from Object
        System.out.println("public ACar()");
        // MESSAGE = "World"; // Compile Error
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //public abstract void carRides();
}
