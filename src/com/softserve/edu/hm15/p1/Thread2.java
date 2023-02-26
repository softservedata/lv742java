package com.softserve.edu.hm15.p1;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (App.monitor) {
                System.out.println("Thread2 is running--------------------------------------" + Thread.currentThread());
            }
        }
    }
}
