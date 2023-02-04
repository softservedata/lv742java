package com.softserve.edu.hm9;

import java.util.*;

public class CollectionUtil {
    public static int random(int begin, int end) {
        return (int) ((Math.random() * (end - begin)) + begin);
    }

    public static void fillCollection(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000) * ((random.nextInt(2) == 1) ? -1 : 1));
        }
    }

    public static void swapMaxMinElement(List<Integer> list) {
        if (list.size() == 0) return;
        int jMin = 0, min = list.get(0);
        int jMax = 0, max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
                jMin = i;
            }
            if (max < list.get(i)) {
                max = list.get(i);
                jMax = i;
            }
        }
        System.out.println("The min value is " + min + ". index is " + jMin);
        System.out.println("The max value is " + max + ". index is " + jMax);
        list.set(jMax, min);
        list.set(jMin, max);
    }

    public static void insertNumberBeforeNegativeElement(List<Integer> list) {
        int index = -1;
        for (Integer el : list) {
            index++;
            if (el < 0) break;
        }
        if (index >= 0) {
            list.add(index, CollectionUtil.random(100, 999));
        }
    }

    public static void insertZero(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) < 0 && list.get(i + 1) > 0) || (list.get(i) > 0 && list.get(i + 1) < 0)) {
                list.add(i + 1, 0);
                i++;
            }
        }
    }

    public static List<List<Integer>> copyIntoTwoList(List<Integer> list, int k) {
        List<Integer> list1 = new ArrayList<>(list.subList(0, k));
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        List<Integer> list2 = new ArrayList<>(list.subList(k, list.size()));
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        List<List<Integer>> listWithList = new ArrayList<>();
        listWithList.add(list1);
        listWithList.add(list2);
        return listWithList;
    }

    public static boolean removeLastEvenElement(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int positionEvenElement = -1;
        int current = 0;
        int index = 0;
        while (iterator.hasNext()) {
            current = iterator.next();
            if (current % 2 == 0) {
                positionEvenElement = index;
            }
            index++;
        }
        if (positionEvenElement == -1) {
            System.out.println("Can't find even element!");
            return false;
        } else {
            list.remove(positionEvenElement);
            return true;
        }
    }

    public static boolean removeElementAfterFirstMin(List<Integer> list) {
        int min = Collections.min(list);
        System.out.println("min = " + min);
        int position = list.indexOf(min);
        if (position == (list.size() - 1)) {
            return false;
        } else {
            System.out.println("Remove = " + list.get(position + 1));
            list.remove(position + 1);
            return true;
        }
    }
}