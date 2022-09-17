package com.newtonschool.calculator.services;

import com.newtonschool.calculator.constants.MathOperation;
import com.newtonschool.calculator.data.CalculatorInput;
import com.newtonschool.calculator.exception.DivideByZeroException;
import com.newtonschool.calculator.exception.InvalidOperatorException;
import com.newtonschool.calculator.exception.OverflowException;
import com.newtonschool.calculator.exception.UnderflowException;

public class MathService {
    public static double calculate(String mathOperation, CalculatorInput calculatorInput) {
        double num1 = calculatorInput.getNum1();
        double num2 = calculatorInput.getNum2();
        double result;
        switch (mathOperation) {
            case MathOperation.ADD:
                result = num1 + num2;
                break;
            case MathOperation.SUBTRACT:
                result = num1 - num2;
                break;
            case MathOperation.MULTIPLY:
                result = num1 * num2;
                break;
            case MathOperation.DIVIDE:
                if (num2 == 0) {
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        if (result > 100000) {
            throw new OverflowException();
        }
        if (result < -100000) {
            throw new UnderflowException();
        }
        return result;
    }
}
