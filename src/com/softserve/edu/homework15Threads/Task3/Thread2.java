package com.softserve.edu.homework15Threads.Task3;

public class Thread2 extends Thread {


    @Override
    public void run() {

            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread3 three = new Thread3();
            three.start();

        }
    }

