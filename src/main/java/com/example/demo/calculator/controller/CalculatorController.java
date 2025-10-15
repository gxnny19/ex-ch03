package com.example.demo.calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.calculator.dto.CalculationRequest;
import com.example.demo.calculator.dto.CalculationResponse;
import com.example.demo.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    // 이름 명시 주입
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(@Qualifier("calculatorService") CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
        String result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
        return new CalculationResponse(request.getNum1(), request.getNum2(), request.getOperation(), result);
    }

    @GetMapping("/add")
    public CalculationResponse add(@RequestParam(name = "num1") double num1,
                                   @RequestParam(name = "num2") double num2) {
        String result = calculatorService.add(num1, num2);
        return new CalculationResponse(num1, num2, "ADD", result);
    }

    @GetMapping("/substract")
    public CalculationResponse substract(@RequestParam(name = "num1") double num1,
                                         @RequestParam(name = "num2") double num2) {
        String result = calculatorService.substract(num1, num2);
        return new CalculationResponse(num1, num2, "SUBSTRACT", result);
    }

    @GetMapping("/multiply")
    public CalculationResponse multiply(@RequestParam(name = "num1") double num1,
                                        @RequestParam(name = "num2") double num2) {
        String result = calculatorService.multiply(num1, num2);
        return new CalculationResponse(num1, num2, "MULTIPLY", result);
    }

    @GetMapping("/divide")
    public CalculationResponse divide(@RequestParam(name = "num1") double num1,
                                      @RequestParam(name = "num2") double num2) {
        String result = calculatorService.divide(num1, num2);
        return new CalculationResponse(num1, num2, "DIVIDE", result);
    }
}
