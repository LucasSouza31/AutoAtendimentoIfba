package br.edu.ifba.saj.autoatendimento.controllers.estabelecimentoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstabelecimentoController {

    @GetMapping("/cadastrarEstabelecimento")
    public String CadastrarEstabelecimento() {
        return "estabelecimento/estabelecimentoCadastrar";
    }

}
