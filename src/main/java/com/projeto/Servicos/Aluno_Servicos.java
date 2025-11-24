package com.projeto.Servicos;

import com.projeto.modelo.Aluno;
import com.projeto.repositorio.Aluno_Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aluno_Servicos {

    @Autowired
    private Aluno_Repositorio alunoRepository;

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno novoAluno) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        aluno.setNome(novoAluno.getNome());
        aluno.setEmail(novoAluno.getEmail());
        aluno.setTelefone(novoAluno.getTelefone());
        aluno.setDataMatricula(novoAluno.getDataMatricula());
        return alunoRepository.save(aluno);
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}
