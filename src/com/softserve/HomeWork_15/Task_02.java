package com.softserve.HomeWork_15;

public class Task_02 {
    final static Object first = new Object();
    final static Object second = new Object();

    public static Thread thread1 = new Thread(() -> {
        synchronized (first) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {}
            synchronized (second) {
                System.out.println("DONE!");
            }
        }
    });

    public static Thread thread2 = new Thread(() -> {
        synchronized (second) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {}
            synchronized (first) {
                System.out.println("DONE!");
            }
        }
    });

    public static void main(String[] args) {
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }
}
