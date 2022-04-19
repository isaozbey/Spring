package com.Ozbey.Controller;

import com.Ozbey.Model.Player;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class mainController {

    @RequestMapping("/player")
    public String playerList(Model model){


        Faker faker=new Faker();

        List<Player> list= Arrays.asList(
                new Player(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,60)),
                new Player(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,60)),
                new Player(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,60)),
                new Player(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,60)),
                new Player(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,60))
           );

        model.addAttribute("name",list.get(0).getFirstName());
        model.addAttribute("players",list);

        return "player.html";
    }
    @RequestMapping("player-info")
    public String playerInfo(Model model){
        Player player_1=new Player("Sergen","Yalcin",45);
        model.addAttribute("player",player_1);
        return "player-info.html";
    }
}
