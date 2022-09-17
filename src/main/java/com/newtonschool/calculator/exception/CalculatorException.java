package com.newtonschool.calculator.exception;

public class CalculatorException extends RuntimeException {

    private String errorCode;

    public CalculatorException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
