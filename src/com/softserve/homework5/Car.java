package com.softserve.homework5;

public class Car implements Comparable<Car> {

    private Type type;
    private int productionYear;
    private double engineCapacity;

    public Car(Type type, int productionYear, double engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }


    public Car() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car o) {
        return this.productionYear - o.productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
