package br.edu.ifba.saj.autoatendimento.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

import br.edu.ifba.saj.autoatendimento.model.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho,UUID>{
    
}
