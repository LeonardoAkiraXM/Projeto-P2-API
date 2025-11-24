package com.projeto.repositorio;

import com.projeto.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Usuario_Repositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
