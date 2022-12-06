package ru.job4j.accident.controller;

import lombok.NoArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.accident.service.AccidentService;

@Controller
@NoArgsConstructor
@ThreadSafe
@RequestMapping("/accident")
public class IndexController {
    private AccidentService accidentService;

    @GetMapping("/index")
    public String indexGet(Model model) {
        model.addAttribute("accidents", accidentService.findAll());
        return "index";
    }
}
