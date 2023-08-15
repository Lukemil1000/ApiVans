package com.unip.ApiVans.services;

import com.unip.ApiVans.entities.Escola;
import com.unip.ApiVans.entities.Motorista;
import com.unip.ApiVans.repositories.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscolaService {

    @Autowired
    private EscolaRepository repository;

    public List<Escola> findAll() {
        return repository.findAll();
    }

    public Escola findById(Long id) {
        Optional<Escola> obj = repository.findById(id);
        return obj.get();
    }

    public Escola insert(Escola obj) {
        return repository.save(obj);
    }
}
