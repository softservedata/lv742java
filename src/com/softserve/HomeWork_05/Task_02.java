package com.softserve.HomeWork_05;

import java.util.Scanner;

public class Task_02 {
    private int[] numbers;

    public Task_02() {
    }

    public Task_02(int[] numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int product() {
        int product = 1;
        for (int i = numbers.length - 1; i >= numbers.length - 5; i--) {
            product *= numbers[i];
        }
        return product;
    }

    public boolean isPositive() {
        boolean isPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                isPositive = false;
                break;
            }
        }
        return isPositive;
    }

    public int result(int[] numbers) {
        Task_02 task_02 = new Task_02(numbers);
        if (task_02.isPositive()) {
            return task_02.sum();
        } else {
            return task_02.product();
        }
    }

    public void inputOutput() {
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        Task_02 task_02 = new Task_02(numbers);
        System.out.println("The result = " + task_02.result(numbers) + ".");
    }

    public static void main(String[] args) {
        Task_02 task_02 = new Task_02();
        task_02.inputOutput();
    }
}
