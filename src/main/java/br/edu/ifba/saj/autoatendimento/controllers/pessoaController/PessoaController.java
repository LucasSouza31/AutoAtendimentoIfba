
package br.edu.ifba.saj.autoatendimento.controllers.pessoaController;

@Controller
public class PessoaController {

    @Autowired
    private UsuarioService usuarioService;


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





