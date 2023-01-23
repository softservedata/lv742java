package com.softserve.edu.homework06.birds;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean flyind;

    protected Bird() {
        this.feathers = true;
        this.layEggs = true;
        this.flyind = true;
    }

    protected Bird(boolean feathers, boolean layEggs, boolean flyind) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.flyind = flyind;
    }

    public boolean isFeathers(){
        return feathers;
    }

    public boolean isFlyind() {
        return flyind;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void fly(){
        System.out.println("I can"
                + (flyind ? " " : " not ") +"fly");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                ", flyind=" + flyind +
                '}';
    }
}
