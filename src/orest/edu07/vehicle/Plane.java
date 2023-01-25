package orest.edu07.vehicle;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("I can fly on " + maxDistance +
                " km distance and have no more than " + getPassengers() +
                " passengers.");
    }

    @Override
    public void land() {
        System.out.println("I can land on the airfield only.");
    }

}
