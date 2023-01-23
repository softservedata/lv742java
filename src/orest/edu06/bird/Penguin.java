package orest.edu06.bird;

public class Penguin extends NonFlyingBird {
    @Override
    public String toString() {
        return "I am penguin " + super.toString();
    }
}
