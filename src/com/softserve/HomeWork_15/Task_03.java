package com.softserve.HomeWork_15;

public class Task_03 {
    static final Object monitor = new Object();

    public static Thread thread3 = new Thread(() -> {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                System.out.println("\tThread number 3");
            }
        }
    });

    public static Thread thread2 = new Thread(() -> {
        synchronized (monitor) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number 2");
            }
            thread3.start();
        }
    });

    public static Thread thread1 = new Thread(() -> {
        synchronized (monitor) {
            thread2.start();
        }
    });

    public static void main(String[] args) {
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ignored) {}
    }
}
