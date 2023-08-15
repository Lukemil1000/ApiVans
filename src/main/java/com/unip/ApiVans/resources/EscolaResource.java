package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Escola;
import com.unip.ApiVans.services.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/escolas")
public class EscolaResource {

    @Autowired
    private EscolaService service;

    @GetMapping
    public ResponseEntity<List<Escola>> findAll() {
        List<Escola> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Escola> findById(@PathVariable Long id) {
        Escola obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Escola> insert(@RequestBody Escola obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}
