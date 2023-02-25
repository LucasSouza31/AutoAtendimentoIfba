package br.edu.ifba.saj.autoatendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Estabelecimento;
import br.edu.ifba.saj.autoatendimento.repositoy.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    public void salvar(Estabelecimento estabelecimento) {
        estabelecimentoRepository.save(estabelecimento);
    }

    
}
