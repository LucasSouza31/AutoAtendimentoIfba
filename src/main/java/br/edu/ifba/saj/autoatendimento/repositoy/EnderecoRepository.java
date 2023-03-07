package br.edu.ifba.saj.autoatendimento.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.autoatendimento.model.Endereco;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID>{
    
}
