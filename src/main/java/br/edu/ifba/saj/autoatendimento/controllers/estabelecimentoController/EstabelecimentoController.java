package br.edu.ifba.saj.autoatendimento.controllers.estabelecimentoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.ifba.saj.autoatendimento.model.Estabelecimento;
import br.edu.ifba.saj.autoatendimento.services.EstabelecimentoService;

@Controller

public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    // @GetMapping("/cadastrarEstabelecimento")
    // public String CadastrarEstabelecimento() {
    //     return "estabelecimento/estabelecimentoCadastrar";
    // }

    @GetMapping("/cadastrarEstabelecimento")
    public String novoEstabelecimento(Model model) {
        model.addAttribute("estabelecimento", new Estabelecimento());
        return "estabelecimento/estabelecimentoCadastrar";
    }

    @PostMapping("/cadastrarEstabelecimento")
    public String cadastrarEstabelecimento(@ModelAttribute("estabelecimento") Estabelecimento estabelecimento) {
        estabelecimentoService.salvar(estabelecimento);
        return "redirect:/cadastrarEstabelecimento";
    }




}
