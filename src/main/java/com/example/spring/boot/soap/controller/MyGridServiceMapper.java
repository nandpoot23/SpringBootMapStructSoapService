package com.example.spring.boot.soap.controller;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.spring.boot.soap.types.EmpAddress;
import com.example.spring.boot.soap.types.EmpConfigIdentifier;
import com.example.spring.boot.soap.types.EmpDetails;

/**
 * Created by mlahariya23 on 1/12/17.
 * <p>
 * Helper to generate the type safe mapping. Create map functions to convert
 * from one type to another type for the parent and child objects and that is
 * pretty much.
 * <p>
 * Note : Handling Array Objects is not straight forward, look at the way its
 * implemented.
 */

@Mapper
public interface MyGridServiceMapper {

    MyGridServiceMapper INSTANCE = Mappers.getMapper(MyGridServiceMapper.class);

    EmpConfigIdentifier map(com.sample.soap.xml.dm.EmpConfigIdentifier soapEmpConfigIdentifier);

    com.sample.soap.xml.dm.EmpDetails map(EmpDetails restImplResponse);

    List<com.sample.soap.xml.dm.EmpDetails> map(List<EmpDetails> restImplResponse);

    EmpAddress map(com.sample.soap.xml.dm.EmpAddress address);
}
