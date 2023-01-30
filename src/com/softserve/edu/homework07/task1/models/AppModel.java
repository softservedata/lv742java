package com.softserve.edu.homework07.task1.models;

import com.softserve.edu.homework07.task1.controllers.CreateContractEmployeeController;
import com.softserve.edu.homework07.task1.controllers.CreateSalariedEmployeeController;
import com.softserve.edu.homework07.task1.controllers.SortListByLastNameController;
import com.softserve.edu.homework07.task1.controllers.SortListBySalaryController;
import com.softserve.edu.homework07.task1.views.AppView;
import com.softserve.edu.homework07.task1.views.CreateContractEmployeeView;
import com.softserve.edu.homework07.task1.views.CreateSalariedEmployeeView;

import java.util.ArrayList;

public class AppModel {

    ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void sortByLastName() {
        AppView view = new AppView();
        Employee emp = new Employee();
        SortListByLastNameController controller = new SortListByLastNameController(view, this, emp);
        controller.getSortedList();
    }

    public void sortBySalary() {
        AppView view = new AppView();
        Employee emp = new Employee();
        SortListBySalaryController controller = new SortListBySalaryController(view, this, emp);
        controller.getSortedList();
    }


    public void addContract() {
        ContractEmployee model = new ContractEmployee();
        CreateContractEmployeeView view = new CreateContractEmployeeView(model);
        CreateContractEmployeeController controller = new CreateContractEmployeeController(model, view);
        controller.createContractEmployee();
        employees.add(model);
    }

    public void addSalaried() {
        SalariedEmployee model = new SalariedEmployee();
        CreateSalariedEmployeeView view = new CreateSalariedEmployeeView(model);
        CreateSalariedEmployeeController controller = new CreateSalariedEmployeeController(model, view);
        controller.createSalariedEmployee();
        employees.add(model);

    }
}
