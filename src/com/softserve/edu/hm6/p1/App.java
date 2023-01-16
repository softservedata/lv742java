package com.softserve.edu.hm6.p1;

public class App {
    public static void main(String[] arg) {
        Bird[] arrayOfBird = new Bird[4];
        arrayOfBird[0] = new Chicken();
        arrayOfBird[1] = new Eagle();
        arrayOfBird[2] = new Penguin();
        arrayOfBird[3] = new Swallow();

        for (Bird el: arrayOfBird) {
            System.out.println(el);
        }
    }
}
