package com.ozbey.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }
    public String player(){

        return "SoccerPlayer.html";
    }
}
