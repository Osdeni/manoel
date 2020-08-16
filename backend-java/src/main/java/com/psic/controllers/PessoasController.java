package com.psic.controllers;

import com.psic.controllers.dto.pacientes.PacienteDto;
import com.psic.entities.Paciente;
import com.psic.services.PacienteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PessoasController {

    private final PacienteService service;

    public PessoasController(PacienteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<PacienteDto>> all(
            @RequestParam("nome") Optional<String> nome,
            @PageableDefault(sort = {"nome"}, size = 30) Pageable paginacao) {

        // TODO pendente a pesquisa Dinâmica com os Q etc via url do front.

        Page<Paciente> pacientes;
        pacientes = service.findAll(paginacao);

        return ResponseEntity.ok().body(PacienteDto.converter(pacientes));
    }
}
