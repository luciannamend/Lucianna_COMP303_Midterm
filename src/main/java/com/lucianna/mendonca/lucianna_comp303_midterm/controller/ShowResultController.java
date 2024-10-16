package com.lucianna.mendonca.lucianna_comp303_midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowResultController {

    @GetMapping("/showResultPage")
    public String showResultPage(Model model){

        return "showResult";
    }
}
