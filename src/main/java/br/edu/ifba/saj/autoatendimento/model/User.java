package br.edu.ifba.saj.autoatendimento.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;





public class User {
    
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
    // private Set<Role> roles;
    
    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "proprietario")
    // private Set<Estabelecimento> estabelecimento;

}
