package com.softserve.edu.hm5.p4;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
        type = "";
        yearOfProduction = 0;
        engineCapacity = 0.0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Double.compare(car.engineCapacity, engineCapacity) == 0 && type.equals(car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction, engineCapacity);
    }

    public static Car[] createInitArrayOfInstances(Scanner sc) {
        System.out.print("How many instances do you want? ");
        int length = Integer.parseInt(sc.nextLine());
        Car[] arr = new Car[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Car();
            System.out.print("Input type of car[" + (i + 1) + "]: ");
            arr[i].setType(sc.nextLine());
            System.out.print("Input year of production for car[" + (i + 1) + "]: ");
            arr[i].setYearOfProduction(Integer.parseInt(sc.nextLine()));
            System.out.print("Input engine capacity for car[" + (i + 1) + "]: ");
            arr[i].setEngineCapacity(Double.parseDouble(sc.nextLine()));
        }
        return arr;
    }

    public static Car[] searchCarWithProdYear(Car[] arr, int yearForSearch) {
        Car[] temp = new Car[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getYearOfProduction() == yearForSearch) {
                temp[j++] = arr[i];
            }
        }
        if (j > 0) {
            Car[] carsWithSomeYear = new Car[j];
            for (int k = 0; k < j; k++) {
                carsWithSomeYear[k] = temp[k];
            }
            return carsWithSomeYear;
        } else {
            return null;
        }
    }

    public static void orderByYear(Car[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getYearOfProduction() > arr[j + 1].getYearOfProduction()) {
                    Car tempInst = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempInst;
                }
            }
        }
    }
}
