package com.softserve.homework15.task1;

public class MyThreadApp {
    public static void main(String[] args) throws InterruptedException {
        Runnable myThread1 = new MyThread("thread_1");
        Thread thread1 = new Thread(myThread1);
        Runnable myThread2 = new MyThread("thread_2");
        Thread thread2 = new Thread(myThread2);
        Runnable myThread3 = new MyThread("thread_3");
        Thread thread3 = new Thread(myThread3);
        System.out.println("Current thread:" + Thread.currentThread().getName());
        thread1.start();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}
