package com.softserve.edu.hm6.p1;

public class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Eagle{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}
