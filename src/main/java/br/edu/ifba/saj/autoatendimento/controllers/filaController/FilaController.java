package br.edu.ifba.saj.autoatendimento.controllers.filaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilaController {
    
@GetMapping ("/filaEspera")
    public String verFila() {
        return "filaEstabelecimento/fila";
    }


}
