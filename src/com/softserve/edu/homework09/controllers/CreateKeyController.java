package com.softserve.edu.homework09.controllers;

import com.softserve.edu.homework09.views.ViewCreateCollection;
import com.softserve.edu.homework09.utils.AppStarter;

import java.util.List;

public class CreateKeyController {
    List<Integer> list;
    ViewCreateCollection view;

    public CreateKeyController(List<Integer> list, ViewCreateCollection view) {
        this.list = list;
        this.view = view;
    }

    public void getCollection() {
        view.inputElements();
        AppStarter.choose2();
    }
}
