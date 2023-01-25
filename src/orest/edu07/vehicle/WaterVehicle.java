package orest.edu07.vehicle;

public abstract class WaterVehicle extends Passenger implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public abstract void isSailing();
}
