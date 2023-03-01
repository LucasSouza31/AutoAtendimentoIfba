package br.edu.ifba.saj.autoatendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Sessao;
import br.edu.ifba.saj.autoatendimento.repositoy.SessaoRepository;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;
    
    public void salvar(Sessao sessao) {
        sessaoRepository.save(sessao);
    }

}
