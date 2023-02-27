package br.edu.ifba.saj.autoatendimento.controllers.carrinhoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrinhoController {


    
    
    @GetMapping("/carrinho")
    public String carrinhoInicio() {
        return "carrinho/carrinhoDeCompras";
    }




}
