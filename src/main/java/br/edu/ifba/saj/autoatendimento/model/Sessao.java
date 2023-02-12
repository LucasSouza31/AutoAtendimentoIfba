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

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Sessao {
    
    
    @Nonnull
    private String nome; 
    
    @Nonnull
    private String descricao; 

    @OneToMany(mappedBy = "sessao")
    private List<ItemCardapio> itemCardapios;

    @Nonnull
    @ManyToOne
    private Cardapio cardapio;




}
