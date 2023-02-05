package com.softserve.edu.homework09;

import com.softserve.edu.homework09.utils.AppStarter;

public class Test {

    public static void main(String[] args){
        try {
            AppStarter.startApp();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
