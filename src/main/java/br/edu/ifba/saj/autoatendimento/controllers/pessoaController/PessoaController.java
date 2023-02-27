
package br.edu.ifba.saj.autoatendimento.controllers.pessoaController;

@Controller
public class PessoaController {

    @GetMapping("/cadastrarPessoa")
    public String CadastrarProduto() {
        return "usuario/cadastrarUsuario";
    }




}





