package com.softserve.edu.hm4.p1;

public class Math {
    public static boolean belongToRange(double startRange, double finishRange, double parameter) {
        if (parameter >= startRange && parameter <= finishRange) {
            return true;
        } else {
            return false;
        }
    }

    public static int max(int mass[])
    {
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) max = mass[i];
        }
        return max;
    }

    public static int min(int mass[])
    {
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) min = mass[i];
        }
        return min;
    }
}
