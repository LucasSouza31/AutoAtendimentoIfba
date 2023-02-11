package br.edu.ifba.saj.autoatendimento.controllers.produtoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
    
    @GetMapping("/cadastrarProduto")
    public String CadastrarProduto() {
        return "produto/cadastrarProduto";
    }

    @GetMapping("/produtosCadastrados")
    public String produtosCadastrados() {
        return "produto/produtos";
    }

}
