package com.softserve.edu.homework09.controllers;

import com.softserve.edu.homework09.views.ViewRandomCollection;

import java.util.List;

public class CreateRandomController {
    List<Integer> list;
    ViewRandomCollection view;

    public CreateRandomController(List<Integer> list, ViewRandomCollection view) {
        this.list = list;
        this.view = view;
    }

    public void getCollection() {
        view.createRandomCollection();
        view.getOutput("Collection created " + list);
    }
}
