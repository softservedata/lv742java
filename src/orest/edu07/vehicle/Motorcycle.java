package orest.edu07.vehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void drive() {
        System.out.println("My max speed is " + maxSpeed + " km per hour, and I can care " + getPassengers() + " passenger.");
    }
}
