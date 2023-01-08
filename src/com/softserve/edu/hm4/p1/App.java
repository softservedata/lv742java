package com.softserve.edu.hm4.p1;

import java.util.Scanner;

public class App {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many instances do you want input? ");
        int k = sc.nextInt();
        sc.nextLine();

        double[] dNum = new double[k];
        int[] iNum = new int[k];

        System.out.println("Input " + k + " float number: ");
        for (int i = 0; i < k; i++) {
            System.out.print("Input float number " + (i + 1) + ": ");
            dNum[i] = sc.nextDouble();
            if (Math.belongToRange(-5, 5, dNum[i])) {
                System.out.println("" + dNum[i] + " belong to range [-5, 5]");
            } else {
                System.out.println("" + dNum[i] + " don't belong to range [-5, 5]");
            }
        }

        System.out.println("\nInput " + k + " integer number: ");
        for (int i = 0; i < k; i++) {
            System.out.print("Input integer number " + (i + 1) + ": ");
            iNum[i] = sc.nextInt();
        }
        System.out.println("Max number is " + Math.max(iNum));
        System.out.println("Min number is " + Math.min(iNum));

        System.out.print("\nInput number of http error: ");
        String err = "ERROR" + sc.nextInt();
        //System.out.println("Input value of error is: " + err);
        System.out.println(HttpError.valueOf(err));
        sc.nextLine();

        System.out.println("");
        Dog[] massOfDog = new Dog[k];
        for (int i = 0; i < k; i++) {
            massOfDog[i] = Dog.input(sc);
        }

        System.out.println("The oldest dog is: " + massOfDog[Dog.findOldestDog(massOfDog)]);

        String sameName = Dog.sameNameOfDog(massOfDog);
        if (sameName.equals("")) {
            System.out.println("We don't have any same name dog in the massif");
        } else {
            System.out.println("The same name is " + sameName);
        }

        sc.close();
    }
}
