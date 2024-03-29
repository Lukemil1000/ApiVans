package com.unip.ApiVans.services;

import com.unip.ApiVans.entities.RegistroFalha;
import com.unip.ApiVans.repositories.RegistroFalhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroFalhaService {

    @Autowired
    private RegistroFalhaRepository repository;

    public List<RegistroFalha> findAll() {
        return repository.findAll();
    }

    public RegistroFalha findById(Long id) {
        Optional<RegistroFalha> obj = repository.findById(id);
        return obj.get();
    }

    public RegistroFalha insert(RegistroFalha obj) {
        return repository.save(obj);
    }
}
