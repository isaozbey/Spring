package com.ozbey.controller;

import com.ozbey.bootstrap.dataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {

@RequestMapping("/register")
public String register(Model model){

    model.addAttribute("students", dataGenerator.createStudent());
    return "student/register";
}

    @RequestMapping("/welcome")
    public String info(Model model){

        model.addAttribute("students", dataGenerator.createStudent());

        return "student/welcome";
    }


}
