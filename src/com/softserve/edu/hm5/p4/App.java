package com.softserve.edu.hm5.p4;

import com.softserve.edu.hm5.IOArray;

import java.util.Scanner;

public class App {
    static public void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        Car[] array = Car.createInitArrayOfInstances(sc);

        System.out.println("\t\t*******Search by year*********");
        System.out.print("Enter year for search: ");
        int yearForSearch = Integer.parseInt(sc.nextLine());
        Car[] result = Car.searchCarWithProdYear(array, yearForSearch);
        IOArray.outPutArray(result);

        System.out.println("\t\t*******Sort by year***********");
        Car.orderByYear(array);
        for (Car el : array) {
            System.out.println(el);
        }

        sc.close();
    }
}
