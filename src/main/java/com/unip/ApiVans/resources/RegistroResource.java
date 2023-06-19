package com.unip.ApiVans.resources;

import com.unip.ApiVans.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/registros")
public class RegistroResource {

    @Autowired
    private RegistroService service;
}
