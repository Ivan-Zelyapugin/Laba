package com.together.together.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("title", "Вход");
        return "login";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("title", "Регистрация");
        return "registration";
    }

    @GetMapping("/MyPage")
    public String MyPage(Model model) {
        model.addAttribute("title", "Моя страница");
        return "MyPage";
    }

}
