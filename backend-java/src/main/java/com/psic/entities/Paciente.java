package com.psic.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, targetEntity = Sessao.class)
    private List<Sessao> sessoes;
}
