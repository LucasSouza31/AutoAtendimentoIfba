package br.edu.ifba.saj.autoatendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Cardapio;
import br.edu.ifba.saj.autoatendimento.repositoy.CardapioRepository;

@Service
public class CardapioService {
    
    @Autowired
    private CardapioRepository cardapioRepository;

    public void salvar(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }


}
