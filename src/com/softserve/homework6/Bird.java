package com.softserve.homework6;

public abstract class Bird {

    private Feathers feathers;

    public Feathers getFeathers() {
        return feathers;
    }

    public void setFeathers(Feathers feathers) {
        this.feathers = feathers;
    }

    private String layEggs() {
        return "I lay eggs";
    }

    public abstract String fly();


}
