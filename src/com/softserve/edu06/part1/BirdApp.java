package com.softserve.edu06.part1;

public class BirdApp {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Chicken();
        birds[2] = new Swallow();
        birds[3] = new Penguin();

        for (Bird el: birds) {
            System.out.println(el);
        }
    }
}
