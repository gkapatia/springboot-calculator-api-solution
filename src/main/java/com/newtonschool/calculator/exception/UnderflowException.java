package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class UnderflowException extends CalculatorException {

    public UnderflowException() {
        super(ErrorCode.UNDERFLOW, ResponseMessage.UNDERFLOW);
    }

}