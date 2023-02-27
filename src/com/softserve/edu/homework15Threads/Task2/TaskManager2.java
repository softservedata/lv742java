package com.softserve.edu.homework15Threads.Task2;


public class TaskManager2 implements Runnable  {
    @Override
    public void run() {
        System.out.println("Task 2 started");
        // simulate some work for task 2
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 2 completed");
    }

}

