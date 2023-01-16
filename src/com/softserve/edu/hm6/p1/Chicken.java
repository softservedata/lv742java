package com.softserve.edu.hm6.p1;

public class Chicken extends FlyingBird {
    public Chicken() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Chicken{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}
