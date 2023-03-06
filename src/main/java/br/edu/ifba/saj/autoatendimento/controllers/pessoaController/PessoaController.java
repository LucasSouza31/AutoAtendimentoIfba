
package br.edu.ifba.saj.autoatendimento.controllers.pessoaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;
import br.edu.ifba.saj.autoatendimento.model.TipoUsuario;
import br.edu.ifba.saj.autoatendimento.services.PessoaService;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService usuarioService;


    //  @GetMapping("/cadastrarPessoa")
    //  public String CadastrarProduto() {
    //      return "usuario/cadastrarUsuario";
    //  }

     @GetMapping("/cadastrarPessoa")
     public ModelAndView novoUsuario(Model model) {
        ModelAndView mv= new ModelAndView("usuario/cadastrarUsuario");
        mv.addObject("tipoUsuario", TipoUsuario.values());

        model.addAttribute("pessoa", new Pessoa());
         
         return mv;
     }

     @PostMapping("/cadastrarPessoa")
     public String cadastrarEstabelecimento(@ModelAttribute("pessoa") Pessoa pessoa) {
         usuarioService.salvar(pessoa);
         return "redirect:/cadastrarUsuario";       
     }



}





