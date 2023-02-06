package com.softserve.edu.homework11.task1;

import com.softserve.edu.utils.StringValueValidator;

import java.util.Scanner;

public class View {

    String str;
    Scanner scanner;


    public String doInput(){
        scanner = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        str = scanner.nextLine();
        return str;
    }

    public void getOutput(String output){
        System.out.println(output);
    }
}
