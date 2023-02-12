
package br.edu.ifba.saj.autoatendimento.model;

import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pedido {

    @ManyToOne
    @Nonnull
    private Carrinho carrinho;

    @Nonnull
    @ManyToOne
    private Fila fila;
    
    @Nonnull
    @ManyToOne
    private ItemCardapio itemCardapio;

    @Nonnull
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<StatusPedido> statusPedido;


}
