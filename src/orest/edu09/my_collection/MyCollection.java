package orest.edu09.my_collection;

import java.util.*;

public class MyCollection {
    public void print() {
        List<Integer> myCollection = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                myCollection.add(scanner.nextInt());
            }
        }
        System.out.println("Remove element after the first minimum except the last one: \n"
                + removeElementAfterTheFirstMinimum(myCollection) + "\n");

        System.out.println("Copy first part of list in direct order: \n"
                + copyFirstPartInDirectOrder(myCollection) + "\n");

        System.out.println("Copy second part of list in reverse order: \n"
                + copySecondPartInReversrOrder(myCollection) + "\n");

        System.out.println("Replaced min max list: \n"
                + replaceMinMax(myCollection) + "\n");

        System.out.println("Insert before negative list: \n"
                + insertBeforeNegative(myCollection) + "\n");

        System.out.println("Zero insert list: \n"
                + insertZero(myCollection) + "\n");

        System.out.println("Remove last even list: \n"
                + removeLastEven(myCollection) + "\n");

    }

    public static List<Integer> replaceMinMax(List<Integer> myCollection) {
        myCollection.sort(Integer::compare);

        int min = myCollection.get(0);
        int max = myCollection.get(myCollection.size() - 1);

        int temp;

        temp = min;
        min = max;
        max = temp;

        myCollection.set(0, min);
        myCollection.set(myCollection.size() - 1, max);

        return myCollection;
    }

    public static List<Integer> insertBeforeNegative(List<Integer> myCollection) {
        Random random = new Random();
        int randomDigit = random.nextInt(900) + 100;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomDigit);
                break;
            }
        }
        return myCollection;
    }

    public static List<Integer> insertZero(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)
                    ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
            }
        }
        return myCollection;
    }

    private static List<Integer> copyFirstPartInDirectOrder(List<Integer> myCollection) {
        List<Integer> list1 = myCollection.subList(0, myCollection.size() / 2);
        list1.sort(Integer::compareTo);
        return list1;
    }

    private static List<Integer> copySecondPartInReversrOrder(List<Integer> myCollection) {
        List<Integer> list2 = myCollection.subList(myCollection.size() / 2, myCollection.size());
        list2.sort(Collections.reverseOrder());
        return list2;
    }

    public static List<Integer> removeLastEven(List<Integer> myCollection) {
        ListIterator<Integer> iterator = myCollection.listIterator(myCollection.size());
        boolean noEvenElement = false;

        while (iterator.hasPrevious()) {
            if (iterator.previous() % 2 == 0) {
                iterator.remove();
                noEvenElement = true;
                break;
            }
        }

        if (!noEvenElement) {
            System.out.println("There is no even element.");
        }
        return myCollection;
    }

    public static List<Integer> removeElementAfterTheFirstMinimum(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < myCollection.get(i + 1)) {
                myCollection.remove(myCollection.get(i + 1));
                break;
            }
        }
        return myCollection;
    }
}
