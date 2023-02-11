package br.edu.ifba.saj.autoatendimento.controllers.cardapioController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardapioController {
    
@GetMapping("/cardapio")    
public String exibirCardapio() {
    return "Cardapio/exibirCardapio";
}

@GetMapping("/cadastrarCardapio")    
public String novoCardapio() {
    return "Cardapio/novoCardapio";
}


}
