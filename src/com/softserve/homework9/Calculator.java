package com.softserve.homework9;

import java.util.*;


public class Calculator {

    public List<Integer> createMyCollection() {
        int max = 10;
        int min = -10;
        int range = max - min + 1;
        List<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) ((Math.random() * range) + min);
            nums.add(random);
        }
        return nums;
    }

    public void swapMinAndMaxValue(List<Integer> nums) {
        Integer min = Collections.min(nums);
        Integer max = Collections.max(nums);
        int indexOfMin = nums.indexOf(min);
        int indexOfMax = nums.indexOf(max);
        Collections.swap(nums, indexOfMax, indexOfMin);
    }

    public void insertNumBeforeFirstNegativeNum(List<Integer> nums) {
        int min = 0;
        int counter = 0;
        for (Integer num : nums) {
            if (num < 0) {
                min = num;
                break;
            }
            if (num > 0) {
                counter++;
            }
        }
        if (counter == 10) {
            throw new NoSuchElementException("No negative numbers found");
        }
        int indexOfNegativeNum = nums.indexOf(min);
        int randomMin = 100;
        int randomMax = 999;
        int range = randomMax - randomMin + 1;
        int random = (int) ((Math.random() * range) + randomMin);
        nums.add(indexOfNegativeNum, random);
    }

    public void insertZeroBetweenNums(List<Integer> nums) {
        int counter = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            Integer currentNum = nums.get(i);
            Integer nextNum = nums.get(i + 1);
            int product = currentNum * nextNum;
            if (product < 0) {
                nums.add(i + 1, 0);
            }
            if (currentNum > 9) {
                counter++;
            }
        }
        if (counter == 9) {
            throw new NoSuchElementException("No negative element found");
        }
    }

    public void copyList(List<Integer> nums, int k) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (k > nums.size()) {
                throw new IllegalArgumentException("Requested argument exceeds available number of numbers");
            }
            Integer num1 = nums.get(i);
            list1.add(num1);

        }
        System.out.println("After creating list1: " + list1);
        List<Integer> subList = nums.subList(k, nums.size());
        List<Integer> list2 = new ArrayList<>(subList);
        Collections.reverse(list2);
        System.out.println("After creating list2: " + list2);
    }

    public void removeLastEvenNum(List<Integer> nums) {
        int counter = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) != 0 && nums.get(i) % 2 == 0) {
                nums.remove(nums.get(i));
                break;
            }
            if (nums.get(i) % 2 != 0) {
                counter++;
            }
            if (counter == nums.size()) {
                System.out.println("Even number not found");
            }
        }
    }

    public void removeElementFollowingMinValue(List<Integer> nums) {
        int minValue = nums.get(0);
        int minValueIndex = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < minValue) {
                minValue = nums.get(i);
                minValueIndex = i;
            }
        }
        if (minValueIndex != nums.size() - 1) {
            int followingNumberIndex = minValueIndex + 1;
            nums.remove(followingNumberIndex);
        }
    }

    public void output() {
        Calculator calculator = new Calculator();
        List<Integer> nums = calculator.createMyCollection();
        System.out.println("Original list: " + nums);
        calculator.swapMinAndMaxValue(nums);
        System.out.println("After swap of max and min values: " + nums);
        calculator.insertNumBeforeFirstNegativeNum(nums);
        System.out.println("After inserting 3-digit number before the first negative number: " + nums);
        calculator.insertZeroBetweenNums(nums);
        System.out.println("After inserting zero between positive and negative numbers: " + nums);
        calculator.copyList(nums, 4);
        calculator.removeLastEvenNum(nums);
        System.out.println("After removing the last even number: " + nums);
        calculator.removeElementFollowingMinValue(nums);
        System.out.println("After removing min value following number: " + nums);
    }


}
