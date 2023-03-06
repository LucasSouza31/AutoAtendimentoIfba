package br.edu.ifba.saj.autoatendimento.services;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.autoatendimento.model.Estabelecimento;
import br.edu.ifba.saj.autoatendimento.repositoy.EstabelecimentoRepository;
import br.edu.ifba.saj.autoatendimento.repositoy.PessoaRepository;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository ;

    public void salvar(Estabelecimento estabelecimento) { 
        
                         
        //Pessoa proprietario = pessoaRepository.findByEmail("leandro.costa@ifba.edu.br");
        //  if(proprietario == null){
        //      proprietario = new Pessoa();
        //      proprietario.setFirstName("Leandro");
        //      proprietario.setEmail("leandro.costa@ifba.edu.br");
        //      proprietario.setPhone("9999");
        //      pessoaRepository.save(proprietario);        
        //  }
        // estabelecimento.setProprietario(proprietario);


        

        estabelecimentoRepository.save(estabelecimento);
    }
    public List<Estabelecimento> listar() { 
          
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        
        return estabelecimentos;
    }


    public Optional<Estabelecimento> buscar(UUID id) { 
          
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);
        
        return estabelecimento;
    }

    public void delete(UUID id) { 
          
        estabelecimentoRepository.deleteById(id);        
    }
    
    
}
