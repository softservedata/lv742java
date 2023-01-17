package com.softserve.HomeWork_06.Task_01;

public class Chicken extends NonFlyingBird {

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken: feathers = " + hasFeathers() + ", lay eggs = " + isLayEggs() + ", can fly = " + fly() + ".";
    }
}
