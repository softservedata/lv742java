package com.softserve.HomeWork_05;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    private static int certainYear = -1;

    public Car() {
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void setCertainYear(int certainYear) {
        Car.certainYear = certainYear;
    }

    public void setCertainYear() {
        System.out.println("Write certain model year: ");
        Scanner sc = new Scanner(System.in);
        certainYear = sc.nextInt();
    }

    public String output() {
        String output = "";
        Car car = new Car();
        if (certainYear == -1) {
            car.setCertainYear();
        }

        Car[] carObj = car.carObjCreating();
        int counter = 0;
        output += "Cars of the year " + certainYear + ":\n";
        for (Car value : carObj) {
            if (value.yearOfProduction == certainYear) {
                output += "\t" + value + "\n";
                counter++;
            }
        }
        if (counter == 0) {
            output += "\tThere are no such cars.\n";
        }

        output += "\nCars ordered by the field year:";
        car.carObjSorting(carObj);
        for (Car value : carObj) {
            output += "\n\t" + value;
        }

        return output;
    }

    public Car[] carObjCreating() {
        Car audi = new Car("SUV", 2018, 3.0);
        Car mercedes = new Car("CONVERTIBLE", 2008, 5.5);
        Car skoda = new Car("STATION WAGON", 2017, 2.0);
        Car toyota = new Car("SEDAN", 2007, 4.7);
        Car[] carObj = {audi, mercedes, skoda, toyota};
        return carObj;
    }

    public Car[] carObjSorting(Car[] carObj) {
        for (int i = 0; i < carObj.length - 1; i++) {
            for (int j = i + 1; j < carObj.length; j++) {
                if (carObj[i].yearOfProduction > carObj[j].yearOfProduction) {
                    Car temp = carObj[i];
                    carObj[i] = carObj[j];
                    carObj[j] = temp;
                }
            }
        }
        return carObj;
    }

    @Override
    public String toString() {
        return "Car: " +
                "type = " + type +
                ", yearOfProduction = " + yearOfProduction +
                ", engineCapacity = " + engineCapacity +
                '.';
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.output());
    }
}
