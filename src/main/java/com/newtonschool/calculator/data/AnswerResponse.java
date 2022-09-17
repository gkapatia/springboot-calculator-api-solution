package com.newtonschool.calculator.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AnswerResponse {

    @Max(value = 1000000)
    @Min(value = -1000000)
    @NotNull
    private Double result;

    private String message;

    public AnswerResponse(Double result, String message) {
        this.result = result;
        this.message = message;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
