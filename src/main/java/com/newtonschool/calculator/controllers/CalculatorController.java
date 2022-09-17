package com.newtonschool.calculator.controllers;

import com.newtonschool.calculator.data.AnswerResponse;
import com.newtonschool.calculator.data.CalculatorInput;
import com.newtonschool.calculator.exception.InvalidInputException;
import com.newtonschool.calculator.exception.OverflowException;
import com.newtonschool.calculator.services.MathService;
import com.newtonschool.calculator.services.SuccessMessageService;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class CalculatorController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World";
    }

    @PostMapping(value = "/{mathOperation}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<AnswerResponse> addition(
            @Valid @RequestBody CalculatorInput calculatorInput,
            @NotNull BindingResult bindingResult,
            @PathVariable String mathOperation
    ) throws OverflowException {
        if (bindingResult.hasErrors()) {
            throw new InvalidInputException();
        }
        AnswerResponse answerResponse = new AnswerResponse(
                MathService.calculate(mathOperation, calculatorInput),
                SuccessMessageService.getSuccessMessage(mathOperation)
        );
        return new ResponseEntity<>(answerResponse, HttpStatus.OK);
    }
}
