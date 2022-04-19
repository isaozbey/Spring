package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/car")
public class carController {
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model) {
        System.out.println(make);

        model.addAttribute("make",make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}")
    public String carInfo2(@PathVariable String make, Model model) {
        System.out.println(make);

        model.addAttribute("make",make);
        return "car/car-info";
    }


}
