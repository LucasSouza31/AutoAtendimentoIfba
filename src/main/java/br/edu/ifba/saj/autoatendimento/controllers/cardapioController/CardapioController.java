package br.edu.ifba.saj.autoatendimento.controllers.cardapioController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifba.saj.autoatendimento.model.Cardapio;
import br.edu.ifba.saj.autoatendimento.repositoy.EstabelecimentoRepository;
import br.edu.ifba.saj.autoatendimento.services.CardapioService;

@Controller
public class CardapioController {

    @Autowired
    private CardapioService cardapioService;

    @Autowired
    private EstabelecimentoRepository estabelecimento;
    
@GetMapping("/cardapio")    
public String exibirCardapio() {
    return "Cardapio/exibirCardapio";
}

@GetMapping("/cadastrarCardapio")    
public String novoCardapio(Model model) {
    model.addAttribute("cardapio", new Cardapio());
    return "Cardapio/novoCardapio";
}

@PostMapping("/cadastrarCardapio")
public String cadastrarCardapio( @ModelAttribute("cardapio") Cardapio cardapio) {
    cardapio.setEstabelecimento(estabelecimento.getReferenceById(null));
    cardapioService.salvar(cardapio);
    return "redirect:/cadastrarCardapio";
}



}
