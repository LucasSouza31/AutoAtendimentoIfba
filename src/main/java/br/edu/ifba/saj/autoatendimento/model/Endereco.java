package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
    
    private int numero;

    @Nonnull
    private String rua;

    private String cidade;

    private String estado;

    private String pais;

    private String cep;

    

    

}
