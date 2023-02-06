package com.softserve.edu.homework11.task3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the currency: ");
            String str = scanner.nextLine();

            if (service.verifyRegex(str)) {
                System.out.println("True");
            } else System.out.println("False");
        }
    }
}
