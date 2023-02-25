package br.edu.ifba.saj.autoatendimento.repositoy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.saj.autoatendimento.model.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, UUID>{
    
}
