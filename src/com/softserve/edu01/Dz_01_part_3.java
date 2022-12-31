package com.softserve.edu01;

import java.util.Scanner;

public class Dz_01_part_3 {
    public static void main(String[] args){
        double c1, c2, c3, t1, t2, t3, res1, res2, res3, resSuma;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much standard units per minute cost first call?");
        c1 = sc.nextDouble();
        System.out.println("How much standard units per minute cost second call?");
        c2 = sc.nextDouble();
        System.out.println("How much standard units per minute cost third call?");
        c3 = sc.nextDouble();
        System.out.println("How many minutes was first call?");
        t1 = sc.nextDouble();
        System.out.println("How many minutes was second call?");
        t2 = sc.nextDouble();
        System.out.println("How many minutes was third call?");
        t3 = sc.nextDouble();
        res1 = c1 * t1;
        res2 = c2 * t2;
        res3 = c3 * t3;
        resSuma = res1 + res2 + res3;
        System.out.println("Pay for first call: " + res1);
        System.out.println("Pay for second call: " + res2);
        System.out.println("Pay for third call: " + res3);
        System.out.println("Pay for all calls: " + resSuma);
    }
}
