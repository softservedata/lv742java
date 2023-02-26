package com.softserve.edu.hm15.p1;

import java.util.concurrent.SynchronousQueue;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (App.monitor) {
                System.out.println("Thread1 is running++++++++++++++++++++++++++++++++++++++" + Thread.currentThread());
            }
        }
    }
}