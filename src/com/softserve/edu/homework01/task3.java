package com.softserve.edu.homework01;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First price: ");
        double c1 = in.nextDouble();

        System.out.print("Second price: ");
        double c2 = in.nextDouble();

        System.out.print("Third price: ");
        double c3 = in.nextDouble();

        System.out.print("Time on first call: ");
        double t1 = in.nextDouble();

        System.out.print("Time on second call: ");
        double t2 = in.nextDouble();

        System.out.print("Time on third call: ");
        double t3 = in.nextDouble();
        double p1=c1*t1;
        double p2=c2*t2;
        double p3=c3*t3;
        double tp=c1*t1+c2*t2+c3*t3;
        System.out.println("Price1: " +p1 );
        System.out.println("Price2: " +p2);
        System.out.println("Price3: " +p3);
        System.out.println("Total Price: " +tp);
    }
}
