
package br.edu.ifba.saj.autoatendimento.controllers.pessoaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;
import br.edu.ifba.saj.autoatendimento.services.PessoaService;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService usuarioService;


    // @GetMapping("/cadastrarPessoa")
    // public String CadastrarProduto() {
    //     return "usuario/cadastrarUsuario";
    // }

    @GetMapping("/cadastrarPessoa")
    public String novoUsuario(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "usuario/cadastrarUsuario";
    }

    @PostMapping("/cadastrarEstabelecimento")
    public String cadastrarEstabelecimento(@ModelAttribute("pessoa") Pessoa pessoa) {
        usuarioService.salvar(pessoa);
        return "redirect:/cadastrarUsuario";
    }



}





