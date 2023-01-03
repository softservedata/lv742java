package orest.edu01;

import java.util.Scanner;

public class InputReader {
    public void ask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where are you live, " + name + "?");
        String address = scanner.nextLine();

        System.out.println("Name: " + name + "\nAddress: " + address);
    }
}
