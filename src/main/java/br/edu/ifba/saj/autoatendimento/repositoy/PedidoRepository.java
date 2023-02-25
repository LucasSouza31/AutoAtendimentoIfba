package br.edu.ifba.saj.autoatendimento.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import br.edu.ifba.saj.autoatendimento.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID>{
    
}
