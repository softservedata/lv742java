package com.softserve.edu.hm12.p2;

import com.softserve.edu.hm12.Util;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int count = 10;
        int r1 = 1, r2 = 100;
        List<Integer> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            try {
                System.out.printf("Enter integer number (step %d): ", i);
                list.add(Util.readNumber(r1, r2));
            } catch (OutOfRangeEx e) {
                System.out.printf("Out of range! On step %d. " + e.getMessage() + "\n", i);
                i--;
                continue;
            } catch (NumberFormatException e) {
                System.out.printf("You enter a wrong integer number on step %d. Try again!\n", i);
                i--;
                continue;
            } catch (Exception e) {
                //e.printStackTrace();
                System.err.println("We have a big unknown problem!\t" + e.getMessage());
                break;
            } catch (Throwable e) {
                //e.printStackTrace();
                System.err.println("We have the biggest unknown problem!\t" + e.getMessage());
                break;
            }
        }
        System.out.println("Result: " + list);
    }
}
