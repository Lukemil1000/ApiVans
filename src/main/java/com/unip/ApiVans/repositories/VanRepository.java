package com.unip.ApiVans.repositories;

import com.unip.ApiVans.entities.Van;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VanRepository extends JpaRepository<Van, Long> {
}
