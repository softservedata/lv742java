package com.softserve.PracticalTask_01;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("How are you?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("You are " + answer + ".");
    }
}
