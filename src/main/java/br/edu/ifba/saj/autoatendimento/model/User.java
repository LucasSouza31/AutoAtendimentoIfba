package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;




@Entity
@Getter
@Setter
public class User  extends AbstractEntity{
    
    @Nonnull
    private String firstName;
    @Nonnull
    private String lastName;
    @Nonnull
    @Email
    private String email;
    @Nonnull
    private String picture;
    // @Enumerated(EnumType.STRING)
    // @ElementCollection(fetch = FetchType.EAGER)
    // @Nonnull
    //private Set<Role> roles;
    
    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "proprietario")
    // private Set<Estabelecimento> estabelecimento;

}
