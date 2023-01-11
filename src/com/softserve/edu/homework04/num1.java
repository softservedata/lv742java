package com.softserve.edu.homework04;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {


        System.out.print("Введите число a:");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();

        System.out.print("Введите число b:");
        Scanner in2 = new Scanner(System.in);
        float b = in2.nextFloat();

        System.out.print("Введите число c:");
        Scanner in3 = new Scanner(System.in);
        float c = in3.nextFloat();

        if ((a>=-5)&(a<=5)){
            System.out.println("Число а :" +a+ " Входит в диапазон от -5 и до +5");
        }else{
            System.out.println("Число а :"+a+ " Не входит в диапазон от -5 и до +5");
        }
        if ((b>=-5)&(b<=5)){
            System.out.println("Число b :"+b+ " Входит в диапазон от -5 и до +5");
        }else{
            System.out.println("Число b :"+b+ " Не входит в диапазон от -5 и до +5");
        }
        if ((c>=-5)&(c<=5)){
            System.out.println("Число c :"+c+ " Входит в диапазон от -5 и до +5");
        }else{
            System.out.println("Число c :"+c+ " Не входит в диапазон от -5 и до +5");
        }
    }
}
