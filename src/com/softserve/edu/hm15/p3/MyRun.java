package com.softserve.edu.hm15.p3;

public class MyRun implements Runnable {
    private int numberOfThread = 0;
    private int i = 0;

    public MyRun(int numberOfThread, int i) {
        this.numberOfThread = numberOfThread;
        this.i = i;
    }

    public MyRun() {
        this.numberOfThread = 0;
        this.i = 0;
    }

    @Override
    synchronized public void run() {
        for (int k = 0; k < i; k++) {
            System.out.println("Thread number " + numberOfThread + "(" + Thread.currentThread() + ")");
        }
    }
}
