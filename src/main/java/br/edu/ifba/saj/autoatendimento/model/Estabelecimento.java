package br.edu.ifba.saj.autoatendimento.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")

public class Estabelecimento extends AbstractEntity{
    
    @Nonnull
    private String nome;

    @Nonnull
    @OneToOne(cascade=CascadeType.PERSIST )
    private Endereco endereco;

    @ManyToOne(fetch = FetchType.EAGER)
    private User proprietario;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estabelecimento")
    private List<Carrinho> carrinhos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estabelecimento")
    private List<Fila> filas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estabelecimento")
    private List<Cardapio> cardapios;

}
