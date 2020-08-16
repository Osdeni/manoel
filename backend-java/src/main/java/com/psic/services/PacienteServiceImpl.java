package com.psic.services;

import com.psic.entities.Paciente;
import com.psic.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository repository;

    @Override
    public Page<Paciente> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
