package orest.edu05.car;

public class Car {
    private final Type type;
    private final int yearOfProduction;
    private final float engineCapacity;

    public Car(Type type, int yearOfProduction, float engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
    public Type getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }
    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
