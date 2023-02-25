package com.softserve.HomeWork_15;

public class Task_01 implements Runnable {
    private String message;

    public Task_01(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The message is: " + message);
        }
    }

    public static void main(String[] args) {
        Runnable runnable1 = new Task_01("I`m thread 1");
        Thread t1 = new Thread(runnable1);

        Runnable runnable2 = new Task_01("\t\t\tI`m thread 2");
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {}

        Runnable runnable3 = new Task_01("\t\t\t\t\t\tI`m thread 3");
        Thread t3 = new Thread(runnable3);
        if (!t1.isAlive() && !t2.isAlive()) {
            t3.start();
            try {
                t3.join();
            } catch (InterruptedException ignored) {}
        }
    }
}
