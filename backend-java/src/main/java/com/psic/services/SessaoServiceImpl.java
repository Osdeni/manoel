package com.psic.services;

import com.psic.entities.Sessao;
import com.psic.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SessaoServiceImpl implements SessaoService {

    @Autowired
    private SessaoRepository repository;

    @Override
    public Page<Sessao> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
