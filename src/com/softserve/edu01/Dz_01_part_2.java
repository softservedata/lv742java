package com.softserve.edu01;

import java.util.Scanner;

public class Dz_01_part_2 {
    public static void main(String[] args){
        System.out.println("What is your name?K");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Where are you live, " + name + " ?");
        String address = sc.next();
        System.out.print("Your name: " + name + "\n" + "Your address: " + address);
    }
}
