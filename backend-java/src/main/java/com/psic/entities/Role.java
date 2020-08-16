package com.psic.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }
}
