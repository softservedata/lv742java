package orest.edu07.vehicle;

public abstract class FlyingVehicle extends Passenger implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public abstract void fly();
    public abstract void land();
}
