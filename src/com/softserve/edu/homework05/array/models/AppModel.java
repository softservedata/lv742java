package com.softserve.edu.homework05.array.models;

import com.softserve.edu.homework05.array.controllers.*;
import com.softserve.edu.homework05.array.views.View;

public class AppModel {

    public void processEvenNumb() {
        EvenNumbModel model = new EvenNumbModel();
        View view = new View();
        EvenNumbController controller = new EvenNumbController(model, view);
        controller.getEvenNumb();
    }

    public void processSumOrProd() {
        View view = new View();
        View.SumOrProdView sumOrProdView = view.new SumOrProdView();
        SumOrProdModel model = new SumOrProdModel();
        SumOrProdController controller = new SumOrProdController(model, sumOrProdView);
        controller.getSumOrProd();
    }

    public void processPositionPositiveNumb() {
        View view = new View();
        View.PositionPositiveView indexPositiveView = view.new PositionPositiveView();
        PositionPositiveModel model = new PositionPositiveModel();
        PositionPositiveController controller = new PositionPositiveController(model, indexPositiveView);
        controller.getPositionPositive();
    }

    public void processMin() {
        MinElementModel model = new MinElementModel();
        View view = new View();
        MinElementController controller = new MinElementController(model, view);
        controller.getMinIndex();
    }

    public void processMonthDays() {
        View view = new View();
        View.MonthDaysView monthDaysView = view.new MonthDaysView();
        MonthDaysModel model = new MonthDaysModel();
        MonthDaysController controller = new MonthDaysController(model, monthDaysView);
        controller.getMonthDays();
    }
}
