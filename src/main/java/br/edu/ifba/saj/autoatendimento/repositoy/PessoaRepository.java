package br.edu.ifba.saj.autoatendimento.repositoy;


import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.autoatendimento.model.Pessoa;
import br.edu.ifba.saj.autoatendimento.model.TipoUsuario;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{

    Pessoa findByEmail(String email);

    List <Pessoa> findByUsuario(TipoUsuario tipoUsuario);


}



