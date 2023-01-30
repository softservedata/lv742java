package com.softserve.edu.homework07.task1.controllers;

import com.softserve.edu.homework07.task1.models.AppModel;
import com.softserve.edu.homework07.task1.models.Employee;
import com.softserve.edu.homework07.task1.views.AppView;

public class SortListBySalaryController {
    AppModel model;
    AppView view;

    Employee emp;

    public SortListBySalaryController(AppView view, AppModel model, Employee emp) {
        this.model = model;
        this.emp = emp;
        this.view = view;
    }

    public void getSortedList() {
        model.getEmployees().sort(emp.new SalaryComparator());
        for (Employee employee : model.getEmployees()) {
            view.getOutput(employee);
        }
    }


}
