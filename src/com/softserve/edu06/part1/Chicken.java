package com.softserve.edu06.part1;
public class Chicken extends NonFlyingBird{
    public Chicken(){
        super(true, true);
    }

    @Override
    public String toString() {
        return "Chicken{ " + "feathers = " + isFeathers() + " layEggs = " + isLayEggs() + " fly = " + fly() + "}";
    }
}
