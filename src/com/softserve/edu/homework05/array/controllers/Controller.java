package com.softserve.edu.homework05.array.controllers;

import com.softserve.edu.homework05.array.models.AppModel;
import com.softserve.edu.homework05.array.views.View;

public class Controller {

    AppModel model;
    View view;

    public Controller(AppModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        firstChoose(view.chooseFirstOption());
    }

    public void firstChoose(int i) {
        switch (i) {
            case 1:
                model.processMonthDays();
                break;
            case 2: {
                secondChoose(view.chooseSecondOption());
            }
            break;
            case 0:view.closeApp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }

    public void secondChoose(int n) {
        switch (n) {

            case 1:
                model.processSumOrProd();
                break;
            case 2:
                model.processPositionPositiveNumb();
                break;
            case 3:
                model.processMin();
                break;
            case 4:
                model.processEvenNumb();
                break;
            case 0: view.closeApp();
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);

        }

    }
}
