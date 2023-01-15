package com.softserve.edu.hm5.p1;

import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of month: ");
        int currentNumber = Integer.parseInt(sc.nextLine());
        if (currentNumber <= 0 || currentNumber >= 12) {
            System.out.println("You enter incorrect number!");
            return;
        }
        System.out.println("Current month is " + Months.getMonthByNumber(currentNumber) +
                ". This month have " + Months.getMonthByNumber(currentNumber).getCountDaysInMonth() + " days");
        sc.close();
    }
}
