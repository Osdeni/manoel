package com.psic.entities;


import com.psic.enums.EnumPresenca;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Timestamp data;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    private String anotacoes;

    @Enumerated(value = EnumType.STRING)
    private EnumPresenca presenca;
}
