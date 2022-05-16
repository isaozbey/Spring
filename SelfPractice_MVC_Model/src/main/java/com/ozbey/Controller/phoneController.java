package com.ozbey.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/phone")
public class phoneController {
    @RequestMapping("/info")
    public String info(@RequestParam(value = "brand",required = false,defaultValue = "Iphone")String brand, Model model){


        model.addAttribute("brand",brand);
        System.out.println(brand);
        return "phone/Iphone";
    }

    @RequestMapping("/info2/{brand}")
    public String info2(@PathVariable String brand, Model model){

        model.addAttribute("brand",brand);
        return "phone/Samsung";
    }
}
