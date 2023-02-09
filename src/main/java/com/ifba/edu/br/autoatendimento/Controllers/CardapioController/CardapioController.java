package com.ifba.edu.br.autoatendimento.Controllers.CardapioController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardapioController {
    
@GetMapping("/cardapio")    
public String exibirCardapio() {
    return "Cardapio/exibirCardapio";
}


}
