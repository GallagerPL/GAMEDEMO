package com.example.GAMEDEMO;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController{
    @GetMapping("/game")
    public String game(Model model) {
       // model.addAttribute("score", 10);
        return "main";
    }

    @GetMapping("/newgame")
    public String newgame(Model model) {
        return "newgame";
    }

    @GetMapping("/setting")
    public String setting(Model model) {
        return "setting";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}
