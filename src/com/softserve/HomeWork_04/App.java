package com.softserve.HomeWork_04;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        //====================================================
        System.out.println("Write 3 float numbers: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            float a = sc.nextFloat();
            if (a > 5 || a < -5) {
                System.out.println("This numbers don`t belong to the range [-5, 5]\n");
                break;
            } else if (i == 2) {
                System.out.println("This numbers belong to the range [-5, 5]\n");
            }
        }

        //====================================================
        System.out.println("Write 3 integer numbers: ");
        int min = 0, max = 0;
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (i == 0) {
                min = num;
                max = num;
            }
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);

        //====================================================
        System.out.println("\nWrite number of HTTP Error (400 - 404): ");
        int error = sc.nextInt();
        String errorNumber = "n" + error;
        System.out.println(HTTPError.valueOf(errorNumber) + "\n");

        //====================================================
        Dog jersy = new Dog("Jersy", Breed.bulldog, 5);
        Dog molly = new Dog("Molly", Breed.yorkshireTerrier, 3);
        Dog almaz = new Dog("Almaz", Breed.doberman, 7);
        System.out.println(Dog.getSameNames());
        System.out.println(Dog.getOldestDog());
    }
}
