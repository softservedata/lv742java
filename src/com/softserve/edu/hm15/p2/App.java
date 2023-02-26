package com.softserve.edu.hm15.p2;

public class App {
    public static Object mon1 = new Object();
    public static Object mon2 = new Object();

    public static void main(String[] args) {
        Runnable r1 = new MyThread1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new MyThread2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main");
    }
}
