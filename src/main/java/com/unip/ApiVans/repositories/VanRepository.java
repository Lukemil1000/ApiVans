package com.unip.ApiVans.repositories;

import com.unip.ApiVans.entities.Van;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VanRepository extends JpaRepository<Van, Long> {

    @Query(value = "SELECT * FROM Van WHERE placa = ?1 AND codigo = ?2", nativeQuery = true)
    Van findByPlacaAndCodigo(String placa, Integer codigo);
}
