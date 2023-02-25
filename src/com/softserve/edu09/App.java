package com.softserve.edu09;

import java.util.*;

public class App {
    public static void main(String[] args) {
        NumsCalc numsCalc =  new NumsCalc();
        Scanner sc = new Scanner(System.in);
        List<Integer> myCollection = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        int k = 0;

        try {
            System.out.print("Please enter k: ");
            k = sc.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Error was found: " + ex);
        }

        try {
            System.out.println("Please enter nums to list: ");
            for (int i = 0; i < 10; i++){
                myCollection.add(sc.nextInt());
            }
        } catch (InputMismatchException ex){
            System.out.println("Error was found: " + ex);
        }

        // Swap the maximum and minimum elements in the list.

        numsCalc.swapEl(myCollection);

        // random three-digit number before the first negative element of the list

        numsCalc.numberBeforeFirstNegative(myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs

        numsCalc.insertZero(myCollection);

        /*
          Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
          list2 in reverse order.
        */

        numsCalc.divideElementsToDifferentLists(myCollection, list1, list2, k);

        // remove the last even element

        numsCalc.deleteLastEvenNum(myCollection);

        // Remove from the list myCollection the element following the first minimum

        numsCalc.removeElAfterMin(myCollection);
    }
}
