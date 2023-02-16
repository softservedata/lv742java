package com.softserve.homework15.task1;

public class MyThread implements Runnable {
    private final String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread message: " + message);
        }
    }
}
