package com.unip.ApiVans.config;

import com.unip.ApiVans.entities.Van;
import com.unip.ApiVans.repositories.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private VanRepository vanRepository;

    @Override
    public void run(String... args) {

//        Van v1 = new Van(null, "ABC123", "Modelo1", "Branco", "Documento1", "Qrcode1");
//        Van v2 = new Van(null, "DEF456", "Modelo2", "Cinza", "Documento2", "Qrcode2");
//
//        vanRepository.saveAll(Arrays.asList(v1, v2));
    }
}
