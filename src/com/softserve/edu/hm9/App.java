package com.softserve.edu.hm9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        System.out.println("fillCollection");
        CollectionUtil.fillCollection(myCollection, 10);
        System.out.println(myCollection);

        System.out.println("swapMaxMinElement");
        CollectionUtil.swapMaxMinElement(myCollection);
        System.out.println(myCollection);

        System.out.println("insertNumberBeforeNegativeElement");
        CollectionUtil.insertNumberBeforeNegativeElement(myCollection);
        System.out.println(myCollection);

        System.out.println("insertZero");
        CollectionUtil.insertZero(myCollection);
        System.out.println(myCollection);

        System.out.println("copyIntoTwoList");
        int k = 4;
        System.out.println("k = " + k);
        List<List<Integer>> rez = CollectionUtil.copyIntoTwoList(myCollection, k);
        System.out.println(rez.get(0));
        System.out.println(rez.get(1));

        System.out.println("removeLastEvenElement");
        System.out.println("before\n" + myCollection);
        CollectionUtil.removeLastEvenElement(myCollection);
        System.out.println("after\n" + myCollection);

        System.out.println("removeElementAfterFirstMin");
        System.out.println("before\n" + myCollection);
        CollectionUtil.removeElementAfterFirstMin(myCollection);
        System.out.println("after\n" + myCollection);
    }
}
