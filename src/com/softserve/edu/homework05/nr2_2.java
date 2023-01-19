package com.softserve.edu.homework05;


import java.util.Scanner;

public class nr2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter array length(10): ");
//        int size = input.nextInt(); // dadim razmer massiva s klaviatury
//        int array[] = new int[size];
        int[] array = new int[10];
        System.out.println("Insert array elements: ");
        int sum=0;
        int multi=0;
        boolean isPositive = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i < 5) {
                if (array[i] >= 0) {
                    sum = sum +array[i];
                } else {
                    isPositive = false;
                    break;
                }
            }
        }
        multi = array[array.length-1];
        if(!isPositive){
            for (int i = array.length; i > 5; i--) {
                multi =multi * array[i-2];
            }
            System.out.println("product of last 5 element = " + multi);
        } else {
            System.out.println("\n" + "sum of first 5 elements =" + sum);
        }

    }

}
