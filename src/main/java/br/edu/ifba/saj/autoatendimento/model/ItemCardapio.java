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
public class ItemCardapio extends AbstractEntity{
   
    private String descricao;

        @Nonnull
        private String nomeItem;

        @Nonnull
        private double preco;

        @OneToMany(mappedBy = "itemCardapioPai")
        private List<ItemCardapio> itemCardapio;

        @ManyToOne
        private ItemCardapio itemCardapioPai;

        @ManyToOne
        private Sessao sessao;

        @ManyToOne
        private AbstractProduto produto; 



}
