package com.psic.controllers.dto.sessoes;

import com.psic.entities.Sessao;
import com.psic.enums.EnumPresenca;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.sql.Timestamp;

@Getter
public class SessaoDto {
    private Timestamp data;
    private EnumPresenca presenca;
    private String anotacoes;
    private PacienteSessaoDto paciente;

    public SessaoDto(Sessao sessao) {
        this.data = sessao.getData();
        this.presenca = sessao.getPresenca();
        this.anotacoes = sessao.getAnotacoes();
        this.paciente = new PacienteSessaoDto(sessao.getPaciente());
    }

    public static Page<SessaoDto> converter(Page<Sessao> sessoes) {
        return sessoes.map(SessaoDto::new);
    }
}
