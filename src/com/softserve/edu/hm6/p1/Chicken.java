package com.softserve.edu.hm6.p1;

public class Chicken extends NonFlyingBird {
    public Chicken() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Chicken{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}
