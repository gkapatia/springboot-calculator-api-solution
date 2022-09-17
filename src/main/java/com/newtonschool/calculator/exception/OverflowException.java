package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class OverflowException extends CalculatorException {

    public OverflowException() {
        super(ErrorCode.OVERFLOW, ResponseMessage.OVERFLOW);
    }

}