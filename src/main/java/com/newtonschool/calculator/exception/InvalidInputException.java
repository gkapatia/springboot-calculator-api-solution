package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class InvalidInputException extends CalculatorException {

    public InvalidInputException() {
        super(ErrorCode.INVALID_INPUT, ResponseMessage.INVALID_INPUT);
    }

}