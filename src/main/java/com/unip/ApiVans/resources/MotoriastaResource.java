package com.unip.ApiVans.resources;

import com.unip.ApiVans.services.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = " /motoristas")
public class MotoriastaResource {

    @Autowired
    private MotoristaService service;
}
