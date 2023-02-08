package com.softserve.edu07.part2;

public class Liner extends WaterVehicle{

    private int floors;

    public Liner(){

    }

    @Override
    public void isSailing() {
        System.out.println("Liner is Sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

}
