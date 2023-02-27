package com.softserve.edu.homework15Threads.Task1;

public class TaskManager1 {
    public void runTasks() throws InterruptedException {
        // create three threads
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Thread3());

        // start the first two threads
        t1.start();
        t2.start();

        // wait for the first two threads to finish
        t1.join();
        t2.join();

        // start the third thread
        t3.start();
    }
}
