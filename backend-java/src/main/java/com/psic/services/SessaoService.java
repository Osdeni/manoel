package com.psic.services;

import com.psic.entities.Sessao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessaoService {
    Page<Sessao> findAll(Pageable pageable);
}
