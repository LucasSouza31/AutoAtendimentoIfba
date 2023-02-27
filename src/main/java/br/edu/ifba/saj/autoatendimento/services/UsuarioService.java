package br.edu.ifba.saj.autoatendimento.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;
import br.edu.ifba.saj.autoatendimento.repositoy.UsuarioRepository;


@Service
public class UsuarioService{


    @Autowired
    private UsuarioRepository usuarioRepository;


    public void salvar(Pessoa pessoa) {
        UsuarioRepository.save(pessoa);
    }





}














