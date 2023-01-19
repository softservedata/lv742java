package com.softserve.edu.homework05;

import java.util.*;

public class Car {
    private CarType type;
    private Integer engine;
    private Integer year;

    private String name;


    public Car(CarType type, Integer engine, Integer year, String name) {
        this.type = type;
        this.engine = engine;
        this.year = year;
        this.name = name;
    }


    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Integer getEngine() {
        return engine;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return type == car.type && Objects.equals(engine, car.engine) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, engine, year);
    }

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(CarType.TRACK, 15 , 2000, "1"));
        carList.add(new Car(CarType.LIGHT, 2 , 2011, "2"));
        carList.add(new Car(CarType.HEAVY, 155 , 2007, "3"));
        carList.add(new Car(CarType.TRACK, 13 , 1996, "4"));

        carList.sort(Comparator.comparingInt(Car::getYear));
        System.out.println(carList);
        System.out.println("please print year of car .... ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for (Car cars: carList) {
            if(cars.getYear().equals(size)) {
                System.out.println(cars);
            }
        }
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    private Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", engine=" + engine +
                ", year=" + year +
                ", NameCar: "+name+
                '}';
    }
}
