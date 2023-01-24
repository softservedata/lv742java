package com.softserve.edu.homework07.controllers;

import com.softserve.edu.homework07.models.AppModel;
import com.softserve.edu.homework07.models.Employee;
import com.softserve.edu.homework07.views.AppView;

public class SortListByLastNameController {
    AppView view;
    AppModel model;
    Employee emp;

    public SortListByLastNameController(AppView view, AppModel model, Employee emp) {
        this.view = view;
        this.model = model;
        this.emp = emp;
    }

    public void getSortedList() {
        model.getEmployees().sort(emp.new LastNameComparator());
        for (Employee employee : model.getEmployees()
        ) {
            view.getOutput(employee);
        }
    }
}
