package com.projeto.repositorio;

import com.projeto.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Curso_Repositorio extends JpaRepository<Curso, Long> {
    
}
