package com.unip.ApiVans.config;

import com.unip.ApiVans.entities.Motorista;
import com.unip.ApiVans.entities.Van;
import com.unip.ApiVans.repositories.MotoristaRepository;
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

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Override
    public void run(String... args) {

       Van v1 = new Van(null, "ABC123", "Modelo1", "Branco", "Documento1", "Qrcode1");
       Van v2 = new Van(null, "DEF456", "Modelo2", "Cinza", "Documento2", "Qrcode2");
       vanRepository.saveAll(Arrays.asList(v1, v2));

        Motorista m1 = new Motorista(null, "Pedro", "(12)12121-2121", "rg1", "cpf1", "chn1",
                "Bairro", "Rua", 111, "complemento");
        Motorista m2 = new Motorista(null, "João", "(12)12121-2121", "rg2", "cpf2", "chn2",
                "Bairro", "Rua", 222, "complemento");
        motoristaRepository.saveAll(Arrays.asList(m1, m2));

        v1.getMotoristas().add(m1);
        v2.getMotoristas().add(m2);
        vanRepository.saveAll(Arrays.asList(v1, v2));
    }
}
