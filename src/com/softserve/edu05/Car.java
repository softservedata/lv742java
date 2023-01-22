package com.softserve.edu05;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(){
        type = "";
        yearOfProduction = 0;
        engineCapacity = 0.0;
    }

    public Car(String type, int yearOfProduction, double engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public static Car[] findCarWithYear(Car[] mas, int yearOfCar){
        Car[] masOfCarsWithSameYear;
        int count = 0, j = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i].getYearOfProduction() == yearOfCar){
                count ++;
            }
        }
        masOfCarsWithSameYear = new Car[count];
        for (int i = 0; i < mas.length; i++){
            if (mas[i].getYearOfProduction() == yearOfCar){
                masOfCarsWithSameYear[j++] = mas[i];
            }
        }
        return masOfCarsWithSameYear;
    }

    public static void sortArr(Car[] arr) {
        int n = arr.length;
        Car temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].getYearOfProduction() > arr[j].getYearOfProduction()) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}' + "\n";
    }

}
