package com.softserve.edu08bird;

public class Eagle extends FlyingBird {

    public int getMaxSpeed() {
        return 80;
    }

    @Override
    public String toString() {
        return "\nI am Eagle,  " + super.toString();
    }
    
}