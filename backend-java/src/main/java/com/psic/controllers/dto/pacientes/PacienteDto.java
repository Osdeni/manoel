package com.psic.controllers.dto.pacientes;

import com.psic.entities.Paciente;
import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
public class PacienteDto {
    private Long id;
    private String nome;
    private String cpf;

    public PacienteDto(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.cpf = paciente.getCpf();
    }

    public static Page<PacienteDto> converter(Page<Paciente> pacientes) {
        return pacientes.map(PacienteDto::new);
    }
}
