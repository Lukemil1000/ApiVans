package com.unip.ApiVans.services;

import com.unip.ApiVans.entities.Van;
import com.unip.ApiVans.repositories.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VanService {

    @Autowired
    private VanRepository repository;

    public List<Van> findAll() {
        return repository.findAll();
    }

    public Van findById(Long id) {
        Optional<Van> obj = repository.findById(id);
        return obj.get();
    }
}
