package com.softserve.edu.homework09.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.reverse;

public class Calculator {


    public void swapMaxMin(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int indMin = list.indexOf(min);
        int indMax = list.indexOf(max);
        list.set(indMax, min);
        list.set(indMin, max);
    }

    public void insertRandomValue(List<Integer> list) {
        int min = 99;
        int max = 999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        for (int current : list) {
            if (current < 0) {
                list.add(list.indexOf(current), i);
                break;
            }
        }
    }

    public void insertZero(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
            }
        }
    }

    public List<List> copyFirstElements(List<Integer> list, int k) {
        if (k >= 0 && k < list.size()) {
            List<Integer> list1 = list.subList(0, k);
            List<Integer> list2 = (list.subList(k, list.size()));
            reverse(list2);
            List<Integer> reverseList2 = new ArrayList<>(list2);

            List<List> lst = List.of(list1, reverseList2);
            return lst;
        } else return null;
    }

    public void removeEvenElement(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                break;
            }
        }
    }

    public void removeNextMin(List<Integer> list) {
        int minInd = 0;
        int min = list.get(minInd);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minInd = i;
            }
        }
        if (minInd < list.size() - 1) {
            list.remove(minInd + 1);
        }

    }

}
