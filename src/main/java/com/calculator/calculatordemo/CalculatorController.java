package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("plus")
    public String plus(@RequestParam(value="num1", required=false) Integer num1,@RequestParam(value="num2", required=false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Ошибка! Один или два аргумента не указаны!";
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("minus")
    public String minus(@RequestParam(value="num1", required=false) Integer num1,
                        @RequestParam(value="num2", required=false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Ошибка! Один или два аргумента не указаны!";
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam(value="num1", required=false) Integer num1,
                           @RequestParam(value="num2", required=false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Ошибка! Один или два аргумента не указаны!";
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("divide")
    public String divide(@RequestParam(value="num1", required=false) Integer num1,
                        @RequestParam(value="num2", required=false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Ошибка! Один или два аргумента не указаны!";
        return calculatorService.divide(num1, num2);
    }




}


