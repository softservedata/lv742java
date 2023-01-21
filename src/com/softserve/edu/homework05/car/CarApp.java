package com.softserve.edu.homework05.car;

import java.util.Arrays;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car[] cars = createCarsArray(scan);
        CarService cs = new CarService();

        cs.sortCars(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("Enter a year to search for a car model: ");
        int year = Validator.validateNumber(scan);

        Car obj = cs.getCarModelYear(year, cars);

        if (obj != null) System.out.println(obj);
        else System.out.println("Not found!");
        scan.close();
    }

    public static Car[] createCarsArray(Scanner scanner) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.print("--------------------------" + "\nEnter the type: ");
            String type = Validator.validateType(scanner);

            System.out.print("Enter the year of production: ");
            int year = Validator.validateNumber(scanner);

            System.out.print("Enter the engine capacity: ");
            int engCap = Validator.validateNumber(scanner);

            cars[i] = new Car(type, year, engCap);
        }
        return cars;
    }

}
