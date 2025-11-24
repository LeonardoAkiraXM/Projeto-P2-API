package com.projeto.repositorio;

import com.projeto.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Aluno_Repositorio extends JpaRepository<Aluno, Long> {

    Aluno findByEmail(String email);
}
