package com.softserve.edu.homework07.task1.controllers;

import com.softserve.edu.homework07.task1.models.ContractEmployee;
import com.softserve.edu.homework07.task1.views.CreateContractEmployeeView;

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
