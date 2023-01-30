package com.softserve.edu.homework07.task1.controllers;


import com.softserve.edu.homework07.task1.models.AppModel;
import com.softserve.edu.homework07.task1.views.AppView;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        firstChoose(view.chooseOption1());
    }

    public void firstChoose(int i) {
        switch (i) {
            case 1: {
                model.addSalaried();
                run();
            }
            break;
            case 2: {
                model.addContract();
                run();

            }
            break;
            case 3:
                secondChoose(view.chooseOption2());
                break;
            case 0:
                view.closeApp();
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

    }

    public void secondChoose(int n) {
        switch (n) {
            case 1:
                model.sortByLastName();
                break;
            case 2:
                model.sortBySalary();
                break;
            case 0:
                view.closeApp();
        }
    }
}
