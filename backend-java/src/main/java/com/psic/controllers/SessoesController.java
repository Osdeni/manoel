package com.psic.controllers;

import com.psic.controllers.dto.sessoes.SessaoDto;
import com.psic.entities.Sessao;
import com.psic.services.SessaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessoes")
public class SessoesController {

    private final SessaoService service;

    public SessoesController(SessaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SessaoDto>> all(
            @PageableDefault(sort = {"data"}, size = 30) Pageable paginacao) {

        // TODO pendente a pesquisa Dinâmica com os Q etc via url do front.

        Page<Sessao> sessoes;
        sessoes = service.findAll(paginacao);

        return ResponseEntity.ok().body(SessaoDto.converter(sessoes));
    }
}
