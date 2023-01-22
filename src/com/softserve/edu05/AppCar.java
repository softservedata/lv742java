package com.softserve.edu05;


import java.util.Arrays;

public class AppCar {
    public static void main(String[] args) {
        Car car1 = new Car("Sidan", 2014, 4.0);
        Car car2 = new Car("Hatchback", 2004, 2.5);
        Car car3 = new Car("Crossover", 2004, 3.0);
        Car car4 = new Car("Bus", 1999, 2.0);
        Car[] cars = new Car[]{car1, car2, car3, car4};

        Car[] carsWithTheSameYear = Car.findCarWithYear(cars, 2004);
        System.out.println(Arrays.toString(carsWithTheSameYear));

        Car.sortArr(cars);
        System.out.println(Arrays.toString(cars));
    }
}
