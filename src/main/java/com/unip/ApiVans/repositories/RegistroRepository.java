package com.unip.ApiVans.repositories;

import com.unip.ApiVans.entities.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
}