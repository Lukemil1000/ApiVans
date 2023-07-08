package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Motorista;
import com.unip.ApiVans.services.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = " /motoristas")
public class MotoriastaResource {

    @Autowired
    private MotoristaService service;

    @GetMapping
    public ResponseEntity<List<Motorista>> findAll() {
        List<Motorista> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Motorista> findById(@PathVariable Long id) {
        Motorista obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
