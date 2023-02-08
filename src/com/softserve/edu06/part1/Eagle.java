package com.softserve.edu06.part1;

public class Eagle extends FlyingBird{
    public Eagle(){
        super(true, true);
    }

    @Override
    public String toString() {
        return "Eagle{ " + "feathers = " + isFeathers() + " layEggs = " + isLayEggs() + " fly = " + fly() + "}";
    }
}
