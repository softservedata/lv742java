package com.softserve.edu.homework09.controllers;

import com.softserve.edu.homework09.models.AppModel;
import com.softserve.edu.homework09.views.ViewApp;

import java.util.concurrent.TimeUnit;

public class AppController {


    ViewApp viewApp;
    AppModel model;

    public AppController(ViewApp viewApp, AppModel model) {
        this.viewApp = viewApp;
        this.model = model;
    }

    public void run() throws InterruptedException {
        choose1(viewApp.chooseOption1());
    }

    public void choose1(int n){
        switch (n) {
            case 1:
                model.processRandomCollection();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                choose3(viewApp.chooseOption3());
                break;
            case 2:
                model.processKeyCollection();
                break;
            case 0:
                viewApp.closeApp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
    }

    public void choose2(int n) {
        switch (n) {
            case 1:
                model.processKeyCollection();
                break;
            case 2:
                choose3(viewApp.chooseOption3());
                break;
            case 0:
                viewApp.closeApp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
    }

    public void choose3(int n) {
        switch (n) {

            case 1:
                model.processSwapMaxMin();

                break;
            case 2:
                model.processInsertRandomValue();

                break;
            case 3:
                model.processInsertZero();

                break;
            case 4:
                model.processCopyFirstElements();

                break;
            case 5:
                model.processRemoveEvenElement();
                break;
            case 6:
                model.processRemoveNextMin();
                break;
            case 0:
                viewApp.closeApp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);

        }
    }
}
