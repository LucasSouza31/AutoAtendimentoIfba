package br.edu.ifba.saj.autoatendimento.model;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carrinho extends AbstractEntity{
    
    @OneToMany(mappedBy = "carrinho")
    private List<Pedido> pedido;

    @OneToMany(mappedBy = "carrinhoPai")
    private List<Carrinho> carrinho;

    @ManyToOne
    private Carrinho carrinhoPai;

    @Nonnull
    @ManyToOne
    private Estabelecimento estabelecimento;

    @Nonnull
    @ManyToOne
    private User usuario;


}
