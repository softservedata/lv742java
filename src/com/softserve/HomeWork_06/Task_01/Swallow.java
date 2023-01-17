package com.softserve.HomeWork_06.Task_01;

public class Swallow extends FlyingBird {

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow: feathers = " + hasFeathers() + ", lay eggs = " + isLayEggs() + ", can fly = " + fly() + ".";
    }
}
