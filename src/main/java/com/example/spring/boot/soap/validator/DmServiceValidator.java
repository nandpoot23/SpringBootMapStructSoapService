package com.example.spring.boot.soap.validator;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.spring.boot.soap.exception.ErrorCode;
import com.example.spring.boot.soap.exception.FrameworkError;
import com.example.spring.boot.soap.exception.Message;
import com.example.spring.boot.soap.types.EmpConfigIdentifier;

@Component
@Aspect
public class DmServiceValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DmServiceValidator.class);

    @Pointcut("execution(* com.example.spring.boot.soap.service.DmServiceImpl.queryEmpConfigs(..)) && args(id,..))")
    public void validateQueryEmpConf(EmpConfigIdentifier id) {

    }

    @Before("validateQueryEmpConf(empConfigId)")
    public void validateQueryEmpConfigs(EmpConfigIdentifier empConfigId) {

        List<Message> messageList = new ArrayList<Message>();
        if (empConfigId.getId() == 0) {
            LOGGER.debug("please provide the valid id");
            messageList.add(new Message(ErrorCode.CS_1005.getValue()));
        }

        else {
            if (empConfigId.getId() < 0) {
                messageList.add(new Message(ErrorCode.CS_1006.getValue()));
            }
        }
        checkAndThrowMessage(messageList);
    }

    private void checkAndThrowMessage(List<Message> messageList) {
        if (!messageList.isEmpty()) {
            FrameworkError error = new FrameworkError(messageList.get(0).getCode(), messageList.get(0).getArgs(), null,
                    null);
            error.setValidationMessages(messageList);
            throw error;
        }

    }

}
