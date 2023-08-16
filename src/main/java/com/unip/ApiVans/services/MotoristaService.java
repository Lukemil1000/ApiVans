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

    public Motorista insert(Motorista obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Motorista update(Long id, Motorista obj) {
        Motorista entity = repository.getReferenceById(id);
        //ifs
        if(obj.getNome() != null) {
            entity.setNome(obj.getNome());
        }
        if(obj.getTelefone() != null) {
            entity.setTelefone(obj.getTelefone());
        }
        if(obj.getRg() != null) {
            entity.setRg(obj.getRg());
        }
        if(obj.getCpf() != null) {
            entity.setCpf(obj.getCpf());
        }
        if(obj.getCnh() != null) {
            entity.setCnh(obj.getCnh());
        }
        if(obj.getBairro() != null) {
            entity.setBairro(obj.getBairro());
        }
        if(obj.getRua() != null) {
            entity.setRua(obj.getRua());
        }
        if(obj.getNumero() != null) {
            entity.setNumero(obj.getNumero());
        }
        if(obj.getComplemento() != null) {
            entity.setComplemento(obj.getComplemento());
        }
        return repository.save(entity);
    }
}
