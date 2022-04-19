package com.Ozbey.Controller;

import com.Ozbey.Model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class customerController {
@RequestMapping("/register")
public String register(Model model){
    model.addAttribute("customer",new Customer());

    List<String> states= Arrays.asList(
            "Alaska",
            "Alabama",
            "Arkansas",
            "Arizona",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Iowa",
            "Idaho",
            "Illinois",
            "Indiana",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Massachusetts",
            "Maryland",
            "Maine",
            "Michigan",
            "Minnesota",
            "Missouri",
            "Mississippi",
            "Montana",
            "NorthCarolina",
            "NorthDakota",
            "Nebraska",
            "NewHampshire",
            "NewJersey",
            "NewMexico",
            "Nevada",
            "NewYork",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "RhodeIsland",
            "SouthCarolina",
            "SouthDakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Virginia",
            "Vermont",
            "Washington",
            "Wisconsin",
            "WestVirginia",
            "Wyoming");

    model.addAttribute("states",states);

    return "customer/register.html";
}
}
