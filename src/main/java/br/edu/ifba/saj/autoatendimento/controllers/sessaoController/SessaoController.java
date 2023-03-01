package br.edu.ifba.saj.autoatendimento.controllers.sessaoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifba.saj.autoatendimento.model.Sessao;
import br.edu.ifba.saj.autoatendimento.services.SessaoService;

@Controller
public class SessaoController {
    
    @Autowired
    private SessaoService sessaoService;

    @GetMapping("/cadastrarSessao")
    public String sessaoCadastrar( Model model) {
        model.addAttribute("sessao", new Sessao());
        return "Sessao/sessao";
    }

    @PostMapping("/cadastrarSessao")
    public String cadastrarSessao( @ModelAttribute("sessao") Sessao sessao) {
        sessaoService.salvar(sessao);
        return "redirect:/cadastrarSessao";
    }
    


    
}




