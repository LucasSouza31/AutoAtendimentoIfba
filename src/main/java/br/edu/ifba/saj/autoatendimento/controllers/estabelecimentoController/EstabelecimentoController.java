package br.edu.ifba.saj.autoatendimento.controllers.estabelecimentoController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifba.saj.autoatendimento.model.Estabelecimento;
import br.edu.ifba.saj.autoatendimento.services.EstabelecimentoService;

@Controller
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    

    @GetMapping("/cadastrarEstabelecimento")
    public String novoEstabelecimento(Model model) {
        
        model.addAttribute("estabelecimento", new Estabelecimento());
        return "estabelecimento/estabelecimentoCadastrar";
    }

    @PostMapping("/salvarEstabelecimento")
    public String cadastrarEstabelecimento(@ModelAttribute("estabelecimento") Estabelecimento estabelecimento) {        
        estabelecimentoService.salvar(estabelecimento);
        return "redirect:/listarEstabelecimento";
    }

    @GetMapping("/listarEstabelecimento")
    public String listarEstabelecimento(Model model) {

        List<Estabelecimento> estabelecimentos = null;

       estabelecimentos = this.estabelecimentoService.listar();

        model.addAttribute("estabelecimentos", estabelecimentos);

        return "estabelecimento/estabelecimento";
    }

    @GetMapping("estabelecimento/editar/{id}")
    public String showUpdateForm(@PathVariable("id") UUID id, Model model, Optional<Estabelecimento> estabelecimento) {

        estabelecimento = this.estabelecimentoService.buscar(id);
              
        model.addAttribute("estabelecimento", estabelecimento);

        return "estabelecimento/estabelecimentoCadastrar";
    }

    @GetMapping("estabelecimento/deletar/{id}")
    public String deletaRelatorio(@PathVariable("id") UUID id, Model model, RedirectAttributes attributes) {

        Optional<Estabelecimento> estabelecimento = estabelecimentoService.buscar(id);


        estabelecimentoService.delete(estabelecimento.get().getId());

        return "redirect:/listarEstabelecimento";
    }

}
