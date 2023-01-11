package orest.edu05.car;

import java.util.Scanner;

public class CarInteraction {

    public void interaction() {
        Car subaruCrosstrek = new Car(Type.SUV, 2023, 2.0f);
        Car hyundaiAccent = new Car(Type.SEDAN, 2016, 1.4f);
        Car fordMustang = new Car(Type.COUPE, 2017, 5.0f);
        Car hondaOdyssey = new Car(Type.MINIVAN, 2020, 3.5f);

        Car[] cars = {subaruCrosstrek, hyundaiAccent, fordMustang, hondaOdyssey};
        carCheck(cars);
        sortByYear(cars);
    }

    public void carCheck(Car[] cars) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year of manufacture of the vehicle: ");
        int year = scanner.nextInt();
        boolean matchFound = false;

        for (Car car : cars) {
            if (year == car.getYearOfProduction()) {
                System.out.println("The car with year of production of " + year + " is:\n" +
                        car);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("The car with year of production of " + year + " wasn't found.");
        }
        scanner.close();
    }

    public void sortByYear(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }

        System.out.println("Sorted cars by years of production.");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
