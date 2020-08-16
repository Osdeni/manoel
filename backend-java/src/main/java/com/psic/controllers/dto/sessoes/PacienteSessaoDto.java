package com.psic.controllers.dto.sessoes;

import com.psic.entities.Paciente;
import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
public class PacienteSessaoDto {
    private Long id;
    private String nome;

    public PacienteSessaoDto(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
    }

    public static Page<PacienteSessaoDto> converter(Page<Paciente> pacientes) {
        return pacientes.map(PacienteSessaoDto::new);
    }
}
