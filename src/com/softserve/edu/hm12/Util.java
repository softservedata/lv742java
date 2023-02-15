package com.softserve.edu.hm12;

import com.softserve.edu.hm12.p2.OutOfRangeEx;

import java.util.*;

public class Util {
    static public List<Double> inputDoubleNumber(int count) throws IllegalStateException {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>(count);
        System.out.printf("Input %d number(s):\n", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("\tInput number(%d): ", i);
            boolean working = true;
            while (working) {
                try {
                    list.add(Double.parseDouble(sc.nextLine()));
                    working = false;
                } catch (NoSuchElementException | NullPointerException e) {
                    System.err.println("We have some problem with input number!");
                    continue;
                } catch (NumberFormatException e) {
                    System.err.println("You enter a wrong double number. Try again!");
                    continue;
                }
            }
        }
        sc.close();
        return list;
    }

    static public double div(double d1, double d2) throws Throwable {
        return d1 / d2;
    }

    static public int readNumber(int start, int end) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        res = Integer.parseInt(sc.nextLine());
        if (res < start || res > end) {
            throw new OutOfRangeEx("Over the range: " + start + " - " + end);
        }
        return res;
    }
}
