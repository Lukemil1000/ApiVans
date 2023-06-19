package com.unip.ApiVans.resources;

import com.unip.ApiVans.services.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/escolas")
public class EscolaResource {

    @Autowired
    private EscolaService service;
}
