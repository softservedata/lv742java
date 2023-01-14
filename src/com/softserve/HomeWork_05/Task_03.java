package com.softserve.HomeWork_05;

import java.util.Scanner;

public class Task_03 {
    private int[] numbers;

    public Task_03() {
    }

    public Task_03(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int secondPositiveNumberPosition() {
        int counter = 0;
        int secondPositiveNumberPosition = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                counter++;
                if (counter == 2) {
                    secondPositiveNumberPosition = i;
                    break;
                }
            }
        }
        return secondPositiveNumberPosition;
    }

    public int minimumPosition() {
        int minimumPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minimumPosition]) {
                minimumPosition = i;
            }
        }
        return minimumPosition;
    }

    public int minimum() {
        return numbers[minimumPosition()];
    }

    public int evenNumbersProduct() {
        int evenNumbersProduct = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbersProduct *= numbers[i];
            }
        }
        return evenNumbersProduct;
    }

    public void input() {
        System.out.println("Enter 5 integer numbers: ");
        int[] numbers = new int[5];
        this.numbers = numbers;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
    }

    public String output() {
        String result = "";
        Task_03 task_03 = new Task_03(numbers);
        if (task_03.secondPositiveNumberPosition() == -1) {
            result += "There are less than two positive numbers in the array.\n";
        } else {
            result += "The position of second positive number = " + task_03.secondPositiveNumberPosition() + ".\n";
        }

        result += "The minimum = " + task_03.minimum() + " and its position = " + task_03.minimumPosition() + ".\n";

        if (task_03.evenNumbersProduct() == 1) {
            result += "There are no even numbers in the array.";
        } else {
            result += "The product of all entered even numbers = " + task_03.evenNumbersProduct() + ".";
        }
        return result;
    }

    public static void main(String[] args) {
        Task_03 task_03 = new Task_03();
        task_03.input();
        System.out.println(task_03.output());
    }
}