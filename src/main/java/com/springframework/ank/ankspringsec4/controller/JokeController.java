package com.springframework.ank.ankspringsec4.controller;

import com.springframework.ank.ankspringsec4.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    //@Autowired
    private JokeService jokeService;
//Constructor injection taken care automatically in spring version 2.5 and above. So Autowired is not required
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }

}
