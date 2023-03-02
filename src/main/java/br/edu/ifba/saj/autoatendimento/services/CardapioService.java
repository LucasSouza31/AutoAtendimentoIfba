package br.edu.ifba.saj.autoatendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Cardapio;
import br.edu.ifba.saj.autoatendimento.repositoy.CardapioRepository;
import br.edu.ifba.saj.autoatendimento.repositoy.EstabelecimentoRepository;

@Service
public class CardapioService {
    
    @Autowired
    private CardapioRepository cardapioRepository;

    @Autowired
    private EstabelecimentoRepository estabelecimento;

    

    public void salvar(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }


}
