package com.newtonschool.calculator.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CalculatorInput {
    @Max(value = 1000000)
    @Min(value = -1000000)
    @NotNull
    private Double num1;
    @Max(value = 1000000)
    @Min(value = -1000000)
    @NotNull
    private Double num2;

    public Double getNum1() {
        return this.num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return this.num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
}
