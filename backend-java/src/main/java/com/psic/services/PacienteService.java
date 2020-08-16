package com.psic.services;

import com.psic.entities.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PacienteService {
    Page<Paciente> findAll(Pageable pageable);
}
