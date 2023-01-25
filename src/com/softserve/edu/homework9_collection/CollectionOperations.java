package com.softserve.edu.homework9_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionOperations {
    //Поменять местами максимальные и минимальные элементы в списке.
    public static void swapMinMax(ArrayList<Integer> collection) {
        int minIndex = collection.indexOf(Collections.min(collection));
        int maxIndex = collection.indexOf(Collections.max(collection));
        int temp = collection.get(minIndex);
        collection.set(minIndex, collection.get(maxIndex));
        collection.set(maxIndex, temp);

    }

    //Вставьте случайное трехзначное число перед первым отрицательным элементом списка.
    public static void ThirdRandom(ArrayList<Integer> collection) {
        Random rand = new Random();
        int randomNum = rand.nextInt(900) + 100;

        int negativeIndex = -1;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }
        if (negativeIndex != -1) {
            collection.add(negativeIndex, randomNum);        }
    }

    //Вставить ноль между всеми соседними элементами коллекции myCollection с разными знаками
    public static void zeroBetween(ArrayList<Integer> collection) {
        for (int i = 0; i < collection.size() - 1; i++) {
            if (Math.signum(collection.get(i)) != Math.signum(collection.get(i + 1))) {
                collection.add(i + 1, 0);
                i++;
            }
        }

    }
    //Скопируйте первые k элементов myCollection в список1 в прямом порядке, а остальные в
    //список2 в обратном порядке.
        public static void copyToLists(ArrayList<Integer> original, int k, ArrayList<Integer> list1, ArrayList<Integer> list2) {
            for (int i = 0; i < original.size(); i++) {
                if (i < k) {
                    list1.add(original.get(i));
                } else {
                    list2.add(0, original.get(i));
                }
            }
        }
    //В списке myCollection удалить последний четный элемент (если в списке есть четные элементы).
    // Если такого элемента нет, вывести сообщение.
    public static void removeLastEven(ArrayList<Integer> collection) {
        boolean evenExist = false;
        int lastEvenIndex = -1;
        for (int i = collection.size() - 1; i >= 0; i--) {
            if (collection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                evenExist = true;
                break;
            }
        }
        if (evenExist) {
            collection.remove(lastEvenIndex);
        } else {
            System.out.println("There is no even element in the list.");
        }
    }
    //Удалить из списка myCollection элемент, следующий за первым минимумом. Если минимум
    //элемент последний, удалять ничего не нужно.
    public static void removeAfterMin(ArrayList<Integer> collection) {
        int minValue = collection.get(0);
        int minIndex = 0;
        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i) < minValue) {
                minValue = collection.get(i);
                minIndex = i;
            }
        }
        if (minIndex == collection.size() - 1) {
            System.out.println("The minimum element is the last one, nothing needs to be removed.");
        } else {
            collection.remove(minIndex + 1);
        }
    }

}
