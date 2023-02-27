package com.softserve.edu.homework15Threads;

import com.softserve.edu.homework15Threads.Task1.TaskManager1;
import com.softserve.edu.homework15Threads.Task2.TaskManager2;
import com.softserve.edu.homework15Threads.Task3.TaskManager3;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n\tTASK_1");
        System.out.println("Running three threads to output different messages for 5 times.");
        System.out.println("The third thread will start after finishing working of the two previous threads.");

        TaskManager1 manager1 = new TaskManager1();
        Thread taskThread=new Thread(() -> {
            try {
                manager1.runTasks();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        taskThread.start();
        try {
            Thread.sleep(50);
            System.out.println("\nInterrupting the task...");
            taskThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n\tTASK_2");
        TaskManager2 manager2 = new TaskManager2();
        Thread thread  = new Thread(manager2);
        thread .start();
        thread .join();
        System.out.println("Main thread finished.");




        /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n\tTASK_3");
        TaskManager3 manager3 = new TaskManager3();
        manager3.runTasks();

    }
}
