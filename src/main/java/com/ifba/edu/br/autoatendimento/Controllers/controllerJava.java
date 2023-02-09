package com.ifba.edu.br.autoatendimento.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controllerJava {

@GetMapping("/login")
public String login() {
    return "login";
}


    




}
