package com.ozbey.Controller;

import com.ozbey.bootstrap.dataGenerator;
import com.ozbey.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class studentController {
    @RequestMapping("student2/welcome")
    public String homePage(@RequestParam String paramm,Model model){
        model.addAttribute("paramm",paramm);

        return "student/welcome";
    }


    @RequestMapping("/car")
    public String carInfo(Model model, @RequestParam(value = "make",required = false, defaultValue = "Honda") String make){
        model.addAttribute("make",make);
        System.out.println(make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}")
    public String getCarInfo(@PathVariable String make, Model model){

        System.out.println(make);
        model.addAttribute("make",make);
        return "car/car-info";
    }

    @RequestMapping("student/register")
    public String register(Model model){
      model.addAttribute("students", dataGenerator.createStudent());
        return "student/register";
    }
}
