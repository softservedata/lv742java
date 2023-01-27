package com.softserve.homework9.practicaltask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionEditor {

    public List<Integer> createCollection() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int ranNum = random.nextInt(40);
            nums.add(ranNum);
        }
        return nums;
    }

    public void printNewCollection(List<Integer> nums) {
        List<Integer> newCollection = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 5) {
                newCollection.add(i);
            }
            if (nums.get(i) <= 5) {
                counter++;
            }
        }
        if (counter == nums.size()) {
            System.out.println("No element greater than 5 found");
        } else {
            System.out.println("NewCollection: " + newCollection);
        }
    }

    public void removeElements(List<Integer> nums) {
        int counter = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) >= 20) {
                nums.remove(i);
                counter++;
            }
        }
        if (nums.size() == 0) {
            System.out.println("List is empty: all numbers are greater than 20");
        } else if (counter == 0) {
            System.out.println("No number greater than 20 found");
        } else {
            System.out.println("After removing numbers greater than 20: " + nums);
        }

    }

    public void insertElements(List<Integer> nums) {
        if (nums.size() > 8) {
            nums.set(1, 1);
            nums.set(7, -3);
            nums.set(4, -4);
            System.out.println("New numbers have been inserted: ");
            for (int i = 0; i < nums.size(); i++) {
                System.out.println("position - " + (i + 1) + ", value of element - " + nums.get(i));
            }
        } else if (nums.size() < 8) {
            System.out.println("Impossible to insert numbers: index out of array list size");
        }

    }

    public void sortAndPrintCollection(List<Integer> nums) {
        Collections.sort(nums);
        System.out.println("Sorted collection:" + nums);
    }

}
