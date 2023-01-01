package com.softserve.edu.hm.p1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        float a, b;
        System.out.print("Input a: ");
        a = sc.nextFloat();
        System.out.print("Input b: ");
        b = sc.nextFloat();
        float c = 0;
        c = a + b;
        System.out.println("a+b=" + c);
        c = a - b;
        System.out.println("a-b=" + c);
        c = a * b;
        System.out.println("a*b=" + c);
        c = a / b;
        System.out.println("a/b=" + c);

        System.out.print("How are you? ");
        String answer = sc.next();
        System.out.println("You are " + answer);

        sc.close();
    }
}
