package com.unip.ApiVans.repositories;

import com.unip.ApiVans.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}