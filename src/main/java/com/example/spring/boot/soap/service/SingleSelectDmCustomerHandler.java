package com.example.spring.boot.soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring.boot.soap.types.EmpConfigIdentifier;
import com.example.spring.boot.soap.types.EmpDetails;

@Component
public class SingleSelectDmCustomerHandler {

    @Autowired
    private com.example.spring.boot.soap.dao.DmDbService mathsDbService;

    public com.example.spring.boot.soap.dao.DmDbService getMathsDbService() {
        return mathsDbService;
    }

    public void setMathsDbService(com.example.spring.boot.soap.dao.DmDbService mathsDbService) {
        this.mathsDbService = mathsDbService;
    }

    public EmpDetails queryEmpConfigs(EmpConfigIdentifier id) {

        EmpDetails empDetails = null;

        if (id != null) {
            empDetails = getMathsDbService().queryEmpConfigs(id);
        }

        return empDetails;
    }

}
