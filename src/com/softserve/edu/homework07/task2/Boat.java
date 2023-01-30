package com.softserve.edu.homework07.task2;

public class Boat extends WaterVehicle{
    int volume;

    Boat(){}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        super.isSailing();
    }
}
