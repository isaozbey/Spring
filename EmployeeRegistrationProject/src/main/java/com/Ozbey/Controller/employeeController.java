package com.Ozbey.Controller;

import com.Ozbey.model.Employee;
import com.Ozbey.model.dataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class employeeController {
    @RequestMapping("employee-create")
    public String register(Model model){
        model.addAttribute("employee",new Employee());
       model.addAttribute("states", dataGenerator.getStates());
        return  "employee-create";
    }

    @PostMapping("/list")
    public String listOfEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,  Model model){
       if(bindingResult.hasErrors()) {
           model.addAttribute("states", dataGenerator.getStates());
           return "employee-create";
       }

        dataGenerator.saveEmployee(employee);
       model.addAttribute("employee",dataGenerator.readAllEmployee());

        return "employee-list";
    }
}
