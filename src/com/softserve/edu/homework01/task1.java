package com.softserve.edu.homework01;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args){


        System.out.println("Calculate the perimeter and area of your circle. \nEnter the radius:");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double pi=3.14;

        double a = pi *(r*r);
        double p = pi *2*r;

        System.out.println("Perimeter="+p);
        System.out.println("Area="+a);
        in.close();

    }
}
