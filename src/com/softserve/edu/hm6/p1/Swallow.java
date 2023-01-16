package com.softserve.edu.hm6.p1;

public class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Swallow{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}
