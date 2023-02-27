package br.edu.ifba.saj.autoatendimento.repositoy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;

import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Pessoa, UUID>{
    
}



