package com.softserve.edu.homework09.views;

import com.softserve.edu.utils.NumberValidator;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ViewRandomCollection {
    Scanner scan;
    List<Integer> list;

    public ViewRandomCollection(List<Integer> list) {
        this.list = list;
    }

    public void createRandomCollection() {
        scan = new Scanner(System.in);
        Random random = new Random();
        int min = -100;
        int max = 100;
        int diff = max - min;
        int n = 0;
        System.out.println("Enter the quantity of items in the collection: ");
        int nums = NumberValidator.validateIntPositiveNumber(scan);
        for (int i = 0; i < nums; i++) {
            n = random.nextInt(diff + 1);
            n += min;
            list.add(n);
        }
    }

    public void getOutput(Object output) {
        System.out.println(output);
    }
}
