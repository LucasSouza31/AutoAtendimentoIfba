package com.ifba.edu.br.autoatendimento.Controllers.PedidoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {
    
    @GetMapping("/fazerPedido")
    public String FazerPedido() {
        return "Pedido/pedido";
    }



}
