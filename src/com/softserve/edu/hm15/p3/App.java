package com.softserve.edu.hm15.p3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    //public static Object monitor = new Object();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new MyRun(2, 3));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.execute(new MyRun(3, 5));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            System.out.print("*");
        }
        System.out.print("done");
    }
}
