package com.softserve.edu.homework15Threads.Task3;

public class Thread1 extends Thread {



    @Override
    public void run() {

            Thread2 two = new Thread2();
            two.start();


        }
}
