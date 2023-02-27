package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class ProdutoIndustrial extends AbstractEntity {


    @Nonnull
    private String nomeProdutoIndustrial;
    


    
}
