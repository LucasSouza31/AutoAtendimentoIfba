package br.edu.ifba.saj.autoatendimento.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pessoa extends AbstractEntity{
    @Nonnull
    private String firstName;
    
    private String lastName;

    @Email
    @Nonnull
    private String email;

    @Nonnull
    private String phone;
    
    private LocalDate dateOfBirth;

    
    private String occupation;   

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "proprietario")
     private Set<Estabelecimento> estabelecimento;

     @Nonnull
     @Enumerated(EnumType.STRING)
     @ElementCollection(fetch = FetchType.EAGER)
     private Set<TipoUsuario> usuario;
 


    // @Enumerated(EnumType.STRING)
    // @ElementCollection(fetch = FetchType.EAGER)
    // @Nonnull
    // private Set<Role> roles;
    




}
