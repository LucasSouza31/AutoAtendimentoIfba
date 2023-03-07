package br.edu.ifba.saj.autoatendimento.services;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;
import br.edu.ifba.saj.autoatendimento.model.TipoUsuario;
import br.edu.ifba.saj.autoatendimento.repositoy.PessoaRepository;


@Service
public class PessoaService{


    @Autowired
    private PessoaRepository pessoaRepository;

    

    public void salvar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public void buscarEmail(Pessoa pessoa) {
        pessoa.getId();
    }

   public List<Pessoa> listarTiposUsuarios(TipoUsuario tipoUsuario) {      
        
    List<Pessoa> pessoas = pessoaRepository.findByUsuario(tipoUsuario);
        
        return pessoas;
   }
  

}














