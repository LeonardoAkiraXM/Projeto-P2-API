package com.projeto.Servicos;

import com.projeto.modelo.Curso;
import com.projeto.repositorio.Curso_Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class Curso_Servicos {

    @Autowired
    private Curso_Repositorio cursoRepository;

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Curso salvar(Curso curso) {
        curso.setDataCriacao(LocalDateTime.now());
        return cursoRepository.save(curso);
    }

    public Curso atualizar(Long id, Curso novoCurso) {
        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));
        curso.setNome(novoCurso.getNome());
        curso.setDescricao(novoCurso.getDescricao());
        curso.setCargaHoraria(novoCurso.getCargaHoraria());
        curso.setStatus(novoCurso.getStatus());
        return cursoRepository.save(curso);
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }
}