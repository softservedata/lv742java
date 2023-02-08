package com.softserve.edu06.part1;

public class Penguin extends NonFlyingBird{
    public Penguin(){
        super(true, true);
    }

    @Override
    public String toString() {
        return "Penguin { " + "feathers = " + isFeathers() + " layEggs = " + isLayEggs() + " fly = " + fly() + "}";
    }
}
