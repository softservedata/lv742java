package com.softserve.HomeWork_09;

import java.util.*;

public class MyCollection {
    private List<Integer> myCollection;

    public MyCollection() {
    }

    public List<Integer> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(List<Integer> myCollection) {
        this.myCollection = myCollection;
    }

    public void fill() {
        myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                myCollection.add(-(int) Math.round(Math.random() * 10));
            } else {
                myCollection.add((int) Math.round(Math.random() * 10));
            }
        }
    }

    public void sort() {
        Collections.sort(myCollection);
    }

    public void swap() {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }
        Integer temp = myCollection.get(minIndex);
        myCollection.set(minIndex, myCollection.get(maxIndex));
        myCollection.set(maxIndex, temp);
    }

    public void threeDigitNumberInsert() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, (int) (Math.random() * 50 + 100));
                break;
            }
        }
    }

    public void zeroInsert() {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            } else if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }
    }

    public List<Integer> copyFirstKElements(int k) {
        List<Integer> list1 = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        return list1;
    }

    public List<Integer> copyLastElements(int k) {
        List<Integer> list2 = new ArrayList<>(myCollection.size() - k);
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        return list2;
    }

    public void lastEvenElementRemove() {
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            } else if (i == 0) {
                System.out.println("There no even numbers in the list.");
            }
        }
    }

    public void removeElementFollowingTheFirstMinimum() {
        int minIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(minIndex) > myCollection.get(i)) {
                minIndex = i;
            }
        }

        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCollection that = (MyCollection) o;
        return Objects.equals(myCollection, that.myCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myCollection);
    }

    @Override
    public String toString() {
        return myCollection.toString();
    }
}
