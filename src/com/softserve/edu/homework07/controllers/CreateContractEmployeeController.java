package com.softserve.edu.homework07.controllers;

import com.softserve.edu.homework07.AppStarter;
import com.softserve.edu.homework07.models.ContractEmployee;
import com.softserve.edu.homework07.models.Employee;
import com.softserve.edu.homework07.views.CreateContractEmployeeView;

public class CreateContractEmployeeController {
    ContractEmployee model;
    CreateContractEmployeeView view;

    public CreateContractEmployeeController(ContractEmployee model, CreateContractEmployeeView view) {
        this.model = model;
        this.view = view;
    }
     public void createContractEmployee(){
        view.doInput();
     }
}
