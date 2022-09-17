package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class InvalidOperatorException extends CalculatorException {

    public InvalidOperatorException() {
        super(ErrorCode.INVALID_OPERATOR, ResponseMessage.INVALID_OPERATOR);
    }

}