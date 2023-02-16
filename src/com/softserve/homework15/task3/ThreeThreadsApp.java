package com.softserve.homework15.task3;

public class ThreeThreadsApp {

    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ": Thread 2");
        }
    });
    Thread threeThreads = new Thread(() -> {
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ": Thread number three");
            }
        });
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    public static void main(String[] args) throws InterruptedException {
        ThreeThreadsApp app = new ThreeThreadsApp();
        Thread t3 = app.getThreeThreads();
        t3.start();
        t3.join();
    }

    public Thread getThreeThreads() {
        return threeThreads;
    }
}
