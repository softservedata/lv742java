package com.softserve.HomeWork_05;

import java.util.Scanner;

public class Task_01 {
    private int monthNumber;

    public Task_01() {
    }

    public Task_01(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int daysAmount() {
        int[] daysAmount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysAmount[monthNumber - 1];
    }

    public void inputOutput() {
        System.out.println("Enter the number of month: ");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        if (monthNumber > 12 || monthNumber <= 0) {
            System.out.println("The input data is incorrect.");
        } else {
            Task_01 days = new Task_01(monthNumber);
            System.out.println("The number of days in this month is " + days.daysAmount() + ".");
        }
    }

    public static void main(String[] args) {
        Task_01 task_01 = new Task_01();
        task_01.inputOutput();
    }
}
