package com.softserve.edu.homework05;
import java.util.Scanner;
public class nr3_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int secondPositive = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int evenProduct = 1;{
            for(int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i+1) + ": ");
                numbers[i] = input.nextInt();
            }
            for(int i = 0; i < 5; i++) {
                if(numbers[i] > 0) {
                    if(secondPositive == -1) {
                        secondPositive = i;
                    } else {
                        secondPositive = i;
                        break;
                    }
                }
            }
            for(int i = 0; i < 5; i++) {
                if(numbers[i] < min) {
                    min = numbers[i];
                    minIndex = i;
                }
            }
            for(int i = 0; i < 5; i++) {
                if(numbers[i] % 2 == 0) {
                    evenProduct = evenProduct *numbers[i];
                }
            }
            if(secondPositive != -1) {
                System.out.println("Position of second positive number: " + (secondPositive+1));
            } else {
                System.out.println("There is no second positive number.");
            }
            System.out.println("Minimum value: " + min + " at position " + (minIndex+1));
            System.out.println("Product of all entered even numbers: " + evenProduct);
        }
    }
}
