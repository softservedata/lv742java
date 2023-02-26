package com.softserve.edu.hm15.p2;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread2 begin");
        for (int i = 0; i < 10000; i++) {
            synchronized (App.mon2) {
                synchronized (App.mon1) {
                    System.out.println("MyThread2_" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("MyThread2 end");
    }
}
