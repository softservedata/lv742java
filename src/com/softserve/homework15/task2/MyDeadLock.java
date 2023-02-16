package com.softserve.homework15.task2;

public class MyDeadLock {
    final static Object first = new Object();
    final static Object second = new Object();

    Runnable t2 = new Runnable() {
        @Override
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Thread interrupted..." + e);
                }
                synchronized (second) {
                    System.out.println("Success!");
                }
            }
        }
    };

    Runnable t1 = new Runnable() {
        @Override
        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Thread interrupted..." + e);
                }
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        }
    };

    public static void main(String[] args) {
        MyDeadLock deadLockDemo = new MyDeadLock();
        Runnable t1 = deadLockDemo.getT1();
        Runnable t2 = deadLockDemo.getT2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

    }

    public Runnable getT1() {
        return t1;
    }

    public Runnable getT2() {
        return t2;
    }

}
