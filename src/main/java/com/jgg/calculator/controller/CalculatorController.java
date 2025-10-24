package com.jgg.calculator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jgg.calculator.dto.CalculationRequest;
import com.jgg.calculator.dto.CalculationResponse;
import com.jgg.calculator.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("calculator")
public class CalculatorController {
	
//	사용법1: @Autowired 어노테이션을 사용하는 방법
//	@Autowired
//	CalculatorService calculatorService;
	
//	사용법2: 생성자를 사용하는 방법: 객체obj
	CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	@PostMapping("/calculate")
	public CalculationResponse calculate(@RequestBody CalculationRequest request) {
		String result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
		
		return new CalculationResponse(request.getNum1(), request.getNum2(), request.getOperation(), result);
	}
	

//	http://localhost:8080/calculator/add?num1=10&num2=5
	@GetMapping("/add")
	public CalculationResponse add(@RequestParam double num1, @RequestParam double num2) {
//		return calculatorService.add(num1, num2);
		String result = calculatorService.add(num1, num2);
		return new CalculationResponse(num1, num2, "ADD", result);
	}
	
//	http://localhost:8080/calculator/substract?num1=10&num2=5
	@GetMapping("/substract")
	public CalculationResponse substract(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.substract(num1, num2);
		return new CalculationResponse(num1, num2, "SUBSTRACT", result);
	}
	
//	http://localhost:8080/calculator/multiply?num1=10&num2=5
	@GetMapping("/multiply")
	public CalculationResponse multiply(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.multiply(num1, num2);
		return new CalculationResponse(num1, num2, "MULTIFLY", result);
	}	
	
//	http://localhost:8080/calculator/divide?num1=10&num2=5
	@GetMapping("/divide")
	public CalculationResponse divide(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.divide(num1, num2);
		return new CalculationResponse(num1, num2,"DIVIDE", result);
	}
	
	

}
