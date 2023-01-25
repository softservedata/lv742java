package com.softserve.edu.homework9_collection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //создаем объект Scanner для чтения ввода с консоли и используем цикл for,
    // чтобы предложить пользователю ввести целочисленное значение 10 раз.
    // Каждое введенное значение добавляется в список «myCollection» с помощью метода add().
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer value: ");

            int value = scanner.nextInt();
            myCollection.add(value);
        }
        System.out.println("Your numbers: "+myCollection);
        /////////////////////111111//////////////////////
        CollectionOperations.swapMinMax(myCollection);
        System.out.println("Swap the maximum and minimum elements in the list: "+myCollection);
        ////////////////////222222////////////////////
        CollectionOperations.ThirdRandom(myCollection);
        System.out.println("A random three-digit number before the first negative element of the list : "+myCollection);
        /////////////////////33333//////////////////////
        CollectionOperations.zeroBetween(myCollection);
        System.out.println("A zero between all neighboring elements collection myCollection with different signs: "+myCollection);
        /////////////////////4444////////////////////
        System.out.print("Enter the number of elements to be copied: ");
        int k = scanner.nextInt();
        CollectionOperations.copyToLists(myCollection, k, list1, list2);
        System.out.println("List1 :" + list1);
        System.out.println("List2 :" + list2);
        /////////////////////55555////////////////////
        CollectionOperations.removeLastEven(myCollection);
        System.out.println("Remove the last even element: "+myCollection);
        ////////////////////66666//////////////////////
        CollectionOperations.removeAfterMin(myCollection);
        System.out.println("Remove from the list myCollection the element following the first minimum: "+myCollection);
    }

}