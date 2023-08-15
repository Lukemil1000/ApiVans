package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.RegistroFalha;
import com.unip.ApiVans.services.RegistroFalhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/falhas")
public class RegistroFalhaResource {

    @Autowired
    private RegistroFalhaService service;

    @GetMapping
    public ResponseEntity<List<RegistroFalha>> findAll() {
        List<RegistroFalha> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RegistroFalha> findById(@PathVariable Long id) {
        RegistroFalha obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<RegistroFalha> insert(@RequestBody RegistroFalha obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}
