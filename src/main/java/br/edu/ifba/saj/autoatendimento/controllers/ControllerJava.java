package br.edu.ifba.saj.autoatendimento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerJava {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
