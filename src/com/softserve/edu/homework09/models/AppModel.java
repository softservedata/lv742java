package com.softserve.edu.homework09.models;

import com.softserve.edu.homework09.controllers.CalculatorController;
import com.softserve.edu.homework09.controllers.CreateKeyController;
import com.softserve.edu.homework09.controllers.CreateRandomController;
import com.softserve.edu.homework09.views.ViewApp;
import com.softserve.edu.homework09.views.ViewCreateCollection;
import com.softserve.edu.homework09.views.ViewRandomCollection;

import java.util.LinkedList;
import java.util.List;

public class AppModel {
    List<Integer> list = new LinkedList<>();

    public void processRandomCollection() {
        ViewRandomCollection view = new ViewRandomCollection(list);
        CreateRandomController controller = new CreateRandomController(list, view);
        controller.getCollection();
    }

    public void processKeyCollection() {
        ViewCreateCollection view = new ViewCreateCollection(list);
        CreateKeyController controller = new CreateKeyController(list, view);
        controller.getCollection();
    }

    public void processSwapMaxMin() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.swapMaxMin();
    }

    public void processInsertRandomValue() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.insertRandomValue();
    }

    public void processInsertZero() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.insertZero();
    }

    public void processCopyFirstElements() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.copyFirstElements();
    }

    public void processRemoveEvenElement() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.removeEvenElement();
    }

    public void processRemoveNextMin() {
        ViewApp view = new ViewApp();
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(list, view, model);
        controller.removeNextMin();
    }
}
