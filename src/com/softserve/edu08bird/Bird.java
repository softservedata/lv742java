package com.softserve.edu08bird;

public abstract class Bird implements Comparable<Bird> {
    private boolean feathers;
    private boolean layEggs;
    private boolean flyind;

    protected Bird() {
        feathers = true;
        layEggs = true;
        flyind = true;
    }
    protected Bird(boolean feathers, boolean layEggs, boolean flyind) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.flyind = flyind;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public boolean isFlyind() {
        return flyind;
    }

    public void fly() {
        System.out.println("I can" 
                + (flyind ? " " : " not ") +"fly");
    }

    @Override
    public int compareTo(Bird bird) {
        return getMaxSpeed() - bird.getMaxSpeed();
    }

    public abstract int getMaxSpeed();

    @Override
    public String toString() {
        return "feathers = " + feathers
                + ",  layEggs = " + layEggs
                + ",  flyind = " + flyind
                + ",  maxSpeed = " + getMaxSpeed();
    }

}
