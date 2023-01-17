package com.softserve.HomeWork_06.Task_01;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle: feathers = " + hasFeathers() + ", lay eggs = " + isLayEggs() + ", can fly = " + fly() + ".";
    }
}
