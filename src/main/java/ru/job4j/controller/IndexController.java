package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String indexGet(Model model) {
        model.addAttribute("user", "Artur Semenov");
        return "index";
    }
}
