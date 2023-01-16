package com.softserve.edu.hm6.p1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public boolean fly() {
        //System.out.println("I can't fly!");
        return false;
    }
}
