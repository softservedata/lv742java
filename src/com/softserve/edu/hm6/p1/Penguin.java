package com.softserve.edu.hm6.p1;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public String toString() {
        return "Penguin{fly=" + fly() + "; feathers=" + isFeathers() + "; layEggs=" + isLayEggs() + "}";
    }
}
