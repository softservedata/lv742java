package com.softserve.edu.homework06.birds;

public class Chicken extends NonFlyingBird{
    public Chicken(){
        super(true);
    }

    @Override
    public String toString() {
        return "Chicken: " + super.toString();
    }
}
