package com.newtonschool.calculator.services;

import com.newtonschool.calculator.constants.MathOperation;
import com.newtonschool.calculator.constants.ResponseMessage;
import com.newtonschool.calculator.exception.InvalidOperatorException;

public class SuccessMessageService {
    public static String getSuccessMessage(String mathOperation) {
        switch (mathOperation) {
            case MathOperation.ADD:
                return ResponseMessage.ADDITION_SUCCESS;
            case MathOperation.SUBTRACT:
                return ResponseMessage.SUBTRACTION_SUCCESS;
            case MathOperation.MULTIPLY:
                return ResponseMessage.MULTIPLICATION_SUCCESS;
            case MathOperation.DIVIDE:
                return ResponseMessage.DIVISION_SUCCESS;
            default:
                throw new InvalidOperatorException();
        }
    }
}
