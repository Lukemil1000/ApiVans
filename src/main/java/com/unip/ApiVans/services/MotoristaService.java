package com.unip.ApiVans.services;

import com.unip.ApiVans.entities.Motorista;
import com.unip.ApiVans.repositories.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository repository;

    public List<Motorista> findAll() {
        return repository.findAll();
    }

    public Motorista findById(Long id) {
        Optional<Motorista> obj = repository.findById(id);
        return obj.get();
    }
}
