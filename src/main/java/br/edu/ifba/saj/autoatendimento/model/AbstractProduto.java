package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@Getter
@Setter
public abstract class AbstractProduto extends AbstractEntity {
    @Nonnull
    private String nomeProduto;
    
    @Nonnull
    private double preco;
    
}
