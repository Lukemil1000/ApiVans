package com.unip.ApiVans.config;

import com.unip.ApiVans.entities.*;
import com.unip.ApiVans.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private VanRepository vanRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private EscolaRepository escolaRepository;

    @Autowired
    private RegistroRepository registroRepository;

    @Autowired
    private RegistroFalhaRepository registroFalhaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) {

        Van v1 = new Van(null, "ABC123", "Modelo1", "Branco", "Documento1", 111);
        Van v2 = new Van(null, "DEF456", "Modelo2", "Cinza", "Documento2", 222);

        Motorista m1 = new Motorista(null, "Pedro", "(12)12121-2121", "rg1", "cpf1", "chn1",
                "Bairro", "Rua", 111, "complemento");
        Motorista m2 = new Motorista(null, "João", "(12)12121-2121", "rg2", "cpf2", "chn2",
                "Bairro", "Rua", 222, "complemento");

        Escola e1 = new Escola(null, "Escola1", "cnpj1", "telefone", "bairro", "Rua",
                123, "complemento");

        Registro r1 = new Registro(null,  LocalDateTime.now(), v1, e1);

        Usuario u1 = new Usuario(null, "Lucas", "Usuario1", "senha123", 1,
                "(12)12121-2121", e1);

        registroRepository.saveAll(Arrays.asList(r1));
        vanRepository.saveAll(Arrays.asList(v1, v2));
        motoristaRepository.saveAll(Arrays.asList(m1, m2));
        escolaRepository.saveAll(Arrays.asList(e1));


        v1.getMotoristas().add(m1);
        v2.getMotoristas().add(m2);
        v1.getMotoristas().add(m2);
        v1.getEscolas().add(e1);
        v2.getEscolas().add(e1);
        vanRepository.saveAll(Arrays.asList(v1, v2));

        RegistroFalha f1 = new RegistroFalha(null, "XYZ987", LocalDateTime.now(), "Qrcode3",
                "Placa não está presente no sistema", e1);

        e1.getRegistrosFalha().add(f1);
        escolaRepository.saveAll(Arrays.asList(e1));
        e1.getUsuarios().add(u1);
        escolaRepository.saveAll(Arrays.asList(e1));
    }
}
