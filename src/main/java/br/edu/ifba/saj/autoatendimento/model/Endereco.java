package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Endereco extends AbstractEntity{
    
    @Nonnull
    private String rua;

    private String cidade;

    private String estado;

    private String pais;

    private String cep;

    

    

}
