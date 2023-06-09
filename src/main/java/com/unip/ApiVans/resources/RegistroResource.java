package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Registro;
import com.unip.ApiVans.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
