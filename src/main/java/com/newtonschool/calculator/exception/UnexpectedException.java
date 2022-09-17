package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class UnexpectedException extends CalculatorException {

    public UnexpectedException() {
        super(ErrorCode.UNEXPECTED, ResponseMessage.UNEXPECTED);
    }

}