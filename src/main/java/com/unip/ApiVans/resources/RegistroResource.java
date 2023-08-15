package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Registro;
import com.unip.ApiVans.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/registros")
public class RegistroResource {

    @Autowired
    private RegistroService service;

    @GetMapping
    public ResponseEntity<List<Registro>> findAll() {
        List<Registro> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Registro> findById(@PathVariable Long id) {
        Registro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Registro> insert(@RequestBody Registro obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}
