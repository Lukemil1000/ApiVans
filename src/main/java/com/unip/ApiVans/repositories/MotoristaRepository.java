package com.unip.ApiVans.repositories;

import com.unip.ApiVans.entities.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}