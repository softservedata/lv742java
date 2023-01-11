package com.softserve.edu04.part1;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1 Task 1

        float f1 = 0, f2 = 0, f3 = 0;
        System.out.print("Please enter f1: ");
        f1 = sc.nextFloat();
        System.out.print("Please enter f2: ");
        f2 = sc.nextFloat();
        System.out.print("Please enter f3: ");
        f3 = sc.nextFloat();

        if (f1 > -5 && f1 < 5 && f2 > -5 && f2 < 5 && f3 > -5 && f3 < 5){
            System.out.println("They all belong to [-5;5]");
        } else {
            System.out.println("Not all of them belong to [-5;5]");
        }

//      Part 1 Task 2

        int n1 = 0, n2 = 0, n3 = 0;

        System.out.print("Please enter n1: ");
        n1 = sc.nextInt();
        System.out.print("Please enter n2: ");
        n2 = sc.nextInt();
        System.out.print("Please enter n3: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("Max: " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("Max: " + n2);
        } else if (n3 > n1 && n3 > n2){
            System.out.println("Max: " + n3);
        }

        if (n1 < n2 && n1 < n3){
            System.out.println("Min: " + n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.println("Min: " + n2);
        } else if (n3 < n1 && n3 < n2){
            System.out.println("Min: " + n3);
        }

        // Part 1 Task 3

        System.out.print("\nPlease enter number of http error: ");
        String err = "HTTPERROR" + sc.nextInt();
        System.out.println(HTTPError.valueOf(err));
    }
}
