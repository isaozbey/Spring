package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class studentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name"," Cybertek School");
        model.addAttribute("course","MVC");
        String subject="Collections";

        model.addAttribute("subject",subject);

        int id = new Random().nextInt(100);

        model.addAttribute("id",id);

        List<Integer> list = Arrays.asList(2,4,5,67,8);

        model.addAttribute("list",list);


        return "student/welcome";
    }
}
