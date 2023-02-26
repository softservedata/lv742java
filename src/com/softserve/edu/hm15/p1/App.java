package com.softserve.edu.hm15.p1;

public class App {
    public static Object monitor = new Object();

    public static void main(String[] args) {
        Runnable thread1 = new Thread1();
        Runnable thread2 = new Thread2();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("t1.join() - err");
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("t2.join() - err");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread3 is running******************************************" + Thread.currentThread());
        }
        System.out.println("End main");
    }
}
