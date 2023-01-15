package com.softserve.edu.homework04;
import java.util.Scanner;
public class num2 {
    public static void main(String[] args){


        System.out.print("Введите число a:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Введите число b:");
        int b = in.nextInt();
        System.out.print("Введите число c:");
        int c = in.nextInt();

        int max,min;
        //...........
//        int max1 = a;
//        int min1 = a;
//
//        if (b > max1) {
//            max1 = b;
//        } else if (b < min1) {
//            min1 = b;
//        }
//        if (c > max1) {
//            max1 = c;
//        } else if (c < min1) {
//            min1 = c;
//        }
//        System.out.println("Maximum: " + max1);
//        System.out.println("Minimum: " + min1);
//
        //maximun
        if ((a>b) & (a>c) & (a!=b))
        {
            max=a;
            System.out.println("MAX A:"+max);
        }
        else if((a>c)&(a==b))
        {
            max=a;
            System.out.println("MAX A and B:"+max);
        }
        else if ((b>a)&(b>c)&(b!=c))
        {
            max=b;
            System.out.println("MAX B:"+max);
        }
        else if((b==c)&&(a!=b))
        {
            max=b;
            System.out.println("MAX B and C:"+max);
        }
        else if((c>a)&(c>b)&(c!=a))
        {
            max=c;
            System.out.println("MAX C:"+max);
        }
        else if(a>b)
        {
            max=a;
            System.out.println("MAX A and C :"+max);
        }
        else {
            max=a;
            System.out.println("MAX A and B and C:"+max);
        }
        //Мinimun
        if ((a<b) & (a<c)&(a!=b)){
            min=a;
            System.out.println("MIN A:"+min);
        }else if((a<c)&(a==b)){
            min=a;
            System.out.println("MIN A and B:"+min);

        }else if((b<a)&(b<c)&(b!=c)){
            min=b;
            System.out.println("MIN B:"+min);
        }else if((b==c)&(a!=b)){
            min=b;
            System.out.println("MIN B and C:"+min);
        }else if((c<a)&(c<b)&(c!=a)){
            min=c;
            System.out.println("MIN C:"+min);
        }else if((a<b)){
            min=a;
            System.out.println("MIN A and C :"+min);
        }else {
            min=a;
            System.out.println("MIN A and B and C:"+min);
        }
    }

}

