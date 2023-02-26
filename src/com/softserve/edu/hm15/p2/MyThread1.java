package com.softserve.edu.hm15.p2;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread1 begin");
        for (int i = 0; i < 10000; i++) {
            synchronized (App.mon1) {
                synchronized (App.mon2) {
                    System.out.println("MyThread1_" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("MyThread1 end");
    }
}
