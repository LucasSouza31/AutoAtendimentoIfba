package br.edu.ifba.saj.autoatendimento.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Cardapio extends AbstractEntity{
    

    @Nonnull
    private String nome;

    @Nonnull
    private String descricao; 
    
    @Nonnull
    @ManyToOne
    private Estabelecimento estabelecimento;

    @OneToMany(mappedBy = "cardapio")
    private List<Sessao> sessao;



}
