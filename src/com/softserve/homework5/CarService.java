package com.softserve.homework5;


import java.util.Arrays;

public class CarService {

    private static Car[] createCars() {
        Car suzuki = new Car(Type.CROSSOVER, 2022, 1.6);
        Car audi = new Car(Type.HATCHBACK, 2022, 1.6);
        Car jeep = new Car(Type.CROSSOVER, 2018, 1.6);
        Car toyota = new Car(Type.CROSSOVER, 2022, 1.6);
        return new Car[]{suzuki, audi, jeep, toyota};
    }

    public static void displayCars() {
        int input = InputReader.readCarInput();
        StringBuilder output = new StringBuilder();
        Car[] cars = createCars();;
        int counter = 0;
        for (Car car : cars) {
            if(input == car.getProductionYear()) {
                output.append(car);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There are no such cars");
        }
        if(counter > 0) {
            Arrays.sort(cars);
            System.out.println("Cars with " + input + " production year: " + output);
        }
    }

}
