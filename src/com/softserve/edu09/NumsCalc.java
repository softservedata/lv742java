package com.softserve.edu09;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumsCalc {
    public void swapEl(List<Integer> myCollection){
        Collections.swap(myCollection, myCollection.indexOf(Collections.min(myCollection)),
                myCollection.indexOf(Collections.max(myCollection)));
        System.out.println("List after changes by method swapEl: ");
        for (Integer current: myCollection) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }

    public void  numberBeforeFirstNegative(List<Integer> myCollection){
        Random rn = new Random();
        for (Integer current: myCollection) {
            if (current < 0) {
                myCollection.add(myCollection.indexOf(current), rn.nextInt(1000 - 100) + 100);
                break;
            }
        }
        System.out.println("List after changes by method numberBeforeFirstNegative: ");
        for (Integer current: myCollection) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }

    public void insertZero(List<Integer> myCollection){
        for (int i = 0; i < myCollection.size()-1; i++) {
            if ((myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) || (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)) {
                myCollection.add(i+1, 0);
            }
        }
        System.out.println("List after changes by method insertZero: ");
        for (Integer current: myCollection) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }

    public void divideElementsToDifferentLists(List<Integer> myCollection, List<Integer> list1, List<Integer> list2, int k){
        for (int i = 0; i < myCollection.size(); i++){
            if (i < k){
                list1.add(myCollection.get(i));
            } else {
                list2.add(myCollection.get(i));
            }
        }
        System.out.println("List1 =================");
        for (Integer current: list1) {
            System.out.println(current);
        }

        Collections.reverse(list2);
        System.out.println("List2 =================");
        for (Integer current: list2) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }

    public void deleteLastEvenNum(List<Integer> myCollection){
        int lastEvenElIndex = 0;
        int count = 0;
        for (Integer current:myCollection) {
            if (current % 2 == 0){
                lastEvenElIndex = myCollection.lastIndexOf(current);
                count++;
            }
        }

        if (count > 0){
            myCollection.remove(lastEvenElIndex);
        } else {
            System.out.println("There are no even numbers");
        }

        System.out.println("List after changes by method deleteLastEvenNum: ");
        for (Integer current: myCollection) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }

    public void removeElAfterMin(List<Integer> myCollection){
        if(myCollection.indexOf(Collections.min(myCollection)) != myCollection.size()-1){
            myCollection.remove(myCollection.indexOf(Collections.min(myCollection)) + 1);
        }
        System.out.println("List after changes by method removeElAfterMin: ");
        for (Integer current: myCollection) {
            System.out.println(current);
        }
        System.out.println("===============================================================");
    }
}
