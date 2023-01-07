package com.softserve.edu.hm3.p2;

import java.util.Scanner;

public class App {
    static public void main(String[] str) {
        Employee[] massEmpl = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            massEmpl[i] = Employee.input(sc);
        }

        for (Employee el : massEmpl) {
            System.out.println(el);
        }
        System.out.println("Total salary: " + Employee.getTotalSum(massEmpl));

        sc.close();
    }
}
