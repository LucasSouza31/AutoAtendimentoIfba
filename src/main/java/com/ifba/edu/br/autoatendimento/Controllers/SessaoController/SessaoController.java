package com.ifba.edu.br.autoatendimento.Controllers.SessaoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessaoController {
    
    @GetMapping("/cadastrarSessao")
    public String sessaoCadastrar() {
        return "Sessao/sessao";
    }




    
}




