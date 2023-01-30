package com.softserve.HomeWork_09;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyCollection myCollection = new MyCollection();
        myCollection.fill();
        System.out.println("myCollection was filled: " + myCollection);

        myCollection.swap();
        System.out.println("\nThe maximum and minimum were swapped: " + myCollection);

        myCollection.threeDigitNumberInsert();
        System.out.println("\nA random three-digit number before the first negative element was inserted: " + myCollection);

        myCollection.zeroInsert();
        System.out.println("\nA zero between all neighboring elements with different signs was inserted: " + myCollection);

        System.out.println("\nEnter k: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("The first k elements of the myCollection were coppied to the list1 in direct order. List1: " + myCollection.copyFirstKElements(k) + ", and the rest to the list2 in reverse order. List2: " + myCollection.copyLastElements(k));


        System.out.print("\nRemoving the last even element: ");
        myCollection.lastEvenElementRemove();
        System.out.println(myCollection);

        myCollection.removeElementFollowingTheFirstMinimum();
        System.out.println("\nThe element following the first minimum was removed: " + myCollection);
    }
}
