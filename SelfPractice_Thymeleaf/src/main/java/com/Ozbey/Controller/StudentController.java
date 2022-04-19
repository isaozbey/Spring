package com.Ozbey.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/new")
    public String getInfo(@RequestParam String firstName, Model model){
        System.out.println(firstName);
        model.addAttribute("firstName",firstName);
        return "student_register";
    }

    @RequestMapping("/info/{studentName}/{studentLastName}")
    public String Get_Student(@PathVariable String studentName , @PathVariable String studentLastName, Model model){

        System.out.println(studentName);
        System.out.println(studentLastName);

        model.addAttribute("name",studentName);
        model.addAttribute("LastName",studentLastName);

        return "student.html";
    }
}
