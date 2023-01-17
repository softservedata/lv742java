package com.softserve.HomeWork_06.Task_01;

public class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin: feathers = " + hasFeathers() + ", lay eggs = " + isLayEggs() + ", can fly = " + fly() + ".";
    }
}
