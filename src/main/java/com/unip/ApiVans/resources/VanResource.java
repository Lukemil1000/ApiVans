package com.unip.ApiVans.resources;

import com.unip.ApiVans.entities.Van;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vans")
public class VanResource {

    @GetMapping
    public ResponseEntity<Van> findAll() {
        Van v = new Van(1L, "ABC123", "Van", "Branco", "Documento", "Qrcode");
        return ResponseEntity.ok().body(v);
    }
}
