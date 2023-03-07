package br.edu.ifba.saj.autoatendimento.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

import br.edu.ifba.saj.autoatendimento.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, UUID>{
    
}
