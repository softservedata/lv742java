package orest.edu07.vehicle;

public abstract class GroundVehicle extends Passenger implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    public abstract void drive();
}
