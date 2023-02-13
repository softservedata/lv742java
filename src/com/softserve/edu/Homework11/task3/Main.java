package com.softserve.edu.Homework11.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        scan.close();

        Currency _currency = new Currency(text);
        _currency.findCurrency();
    }
}




