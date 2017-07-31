package com.example.spring.boot.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring.boot.soap.dao.DmDbService;
import com.example.spring.boot.soap.types.EmpAddress;
import com.example.spring.boot.soap.types.EmpDetails;

@Component
public class SelectAllDmCustomerHandler {

    @Autowired
    private DmDbService mathsDbService;

    public DmDbService getMathsDbService() {
        return mathsDbService;
    }

    public void setMathsDbService(DmDbService mathsDbService) {
        this.mathsDbService = mathsDbService;
    }

    public List<EmpDetails> selectAllEmpAllData(EmpAddress empAddr) {

        List<EmpDetails> empDetailsList = null;

        if (empAddr.getAddress() != null) {
            empDetailsList = getMathsDbService().selectAllEmpAllData(empAddr);
        }
        return empDetailsList;
    }

}
