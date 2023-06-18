package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Van;
import com.unip.ApiVans.services.VanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vans")
public class VanResource {

    @Autowired
    private VanService service;

    @GetMapping
    public ResponseEntity<List<Van>> findAll() {
        List<Van> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Van> findById(@PathVariable Long id) {
        Van obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
