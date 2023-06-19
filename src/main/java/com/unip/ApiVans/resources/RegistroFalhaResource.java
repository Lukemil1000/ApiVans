package com.unip.ApiVans.resources;

import com.unip.ApiVans.services.RegistroFalhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/falhas")
public class RegistroFalhaResource {

    @Autowired
    private RegistroFalhaService service;
}
