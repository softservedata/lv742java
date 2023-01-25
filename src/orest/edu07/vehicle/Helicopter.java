package orest.edu07.vehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("My weight is " + weight +
                " tons, I can fly on " + maxHeight +
                " metres height and can have " + getPassengers() +
                " passengers.");
    }

    @Override
    public void land() {
        System.out.println("I can land anywhere.");
    }
}
