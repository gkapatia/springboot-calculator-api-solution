package com.newtonschool.calculator.exception;

import com.newtonschool.calculator.constants.ErrorCode;
import com.newtonschool.calculator.constants.ResponseMessage;

public class DivideByZeroException extends CalculatorException {

    public DivideByZeroException() {
        super(ErrorCode.DIVIDE_BY_ZERO, ResponseMessage.DIVIDE_BY_ZERO);
    }

}