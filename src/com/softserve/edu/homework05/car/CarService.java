package com.softserve.edu.homework05.car;

import com.sun.source.tree.BreakTree;

public class CarService {

    public Car getCarModelYear(int year, Car[] cars){
        for (Car obj:cars
             ) {
            if (obj.getProdYear()==year){
                return obj;
            }
        }
        return null;
    }

    public void sortCars(Car[] cars){
        Car temp = null;
        boolean isSorted = true;
        for (int i = 0; i< cars.length -1; i++){
            for (int j = 0; j< cars.length -1 - i; j++) {
                if (cars[j].getProdYear() > cars[j + 1].getProdYear()) {
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){break;}
        }
    }
}
