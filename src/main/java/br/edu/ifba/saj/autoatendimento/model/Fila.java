package br.edu.ifba.saj.autoatendimento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Fila extends AbstractEntity{
    
    @ManyToOne
    private Estabelecimento estabelecimento;


}
