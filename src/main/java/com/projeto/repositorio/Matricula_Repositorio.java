package com.projeto.repositorio;

import com.projeto.modelo.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Matricula_Repositorio extends JpaRepository<Matricula, Long> {

    Matricula findByAlunoId(Long alunoId);
}
