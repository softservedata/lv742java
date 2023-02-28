package com.softserve.edu08bird;

public class Swallow extends FlyingBird {

//    public Swallow() {
//        super();
//    }

    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nI am Swallow,  " + super.toString();
    }

}