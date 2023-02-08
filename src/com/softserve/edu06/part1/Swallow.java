package com.softserve.edu06.part1;

public class Swallow extends FlyingBird{
    public Swallow(){
        super(true, true);
    }

    @Override
    public String toString() {
        return "Swallow{ " + "feathers = " + isFeathers() + " layEggs = " + isLayEggs() + " fly = " + fly() + "}";
    }
}
