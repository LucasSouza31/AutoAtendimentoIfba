package br.edu.ifba.saj.autoatendimento.repositoy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.autoatendimento.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {

   
}
