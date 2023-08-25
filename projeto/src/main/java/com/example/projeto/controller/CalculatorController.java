package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CalculatorController {
    @GetMapping("/calculadora")
    public String calculadora() {
        return "calculadora/index";
    }

    @PostMapping("/calcular")
    public String calcular(Model model, double quantity1, double quantity2) {
        double resultado = quantity1 + quantity2;
        model.addAttribute("resultado", resultado);
        return "calculadora/calcular";
    }
}