package com.example.spring.boot.soap.dao;

import java.util.List;

import com.example.spring.boot.soap.types.EmpAddress;
import com.example.spring.boot.soap.types.EmpConfigIdentifier;
import com.example.spring.boot.soap.types.EmpDetails;

public interface DmDbService {

    public EmpDetails queryEmpConfigs(EmpConfigIdentifier id);

    public List<EmpDetails> selectAllEmpAllData(EmpAddress empAddr);

}
