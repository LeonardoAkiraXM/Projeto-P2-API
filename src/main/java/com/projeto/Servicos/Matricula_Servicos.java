package com.projeto.Servicos;

import com.projeto.modelo.Matricula;
import com.projeto.repositorio.Matricula_Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Matricula_Servicos {

    @Autowired
    private Matricula_Repositorio matriculaRepository;

    public List<Matricula> listarTodas() {
        return matriculaRepository.findAll();
    }

    public Matricula salvar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public Matricula atualizar(Long id, Matricula novaMatricula) {
        Matricula matricula = matriculaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Matrícula não encontrada"));
        matricula.setDataMatricula(novaMatricula.getDataMatricula());
        matricula.setStatus(novaMatricula.getStatus());
        matricula.setAluno(novaMatricula.getAluno());
        matricula.setCurso(novaMatricula.getCurso());
        return matriculaRepository.save(matricula);
    }

    public void deletar(Long id) {
        matriculaRepository.deleteById(id);
    }
}