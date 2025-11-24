package com.projeto.Controller;

import com.projeto.modelo.Matricula;
import com.projeto.Servicos.Matricula_Servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private Matricula_Servicos matriculaService;

    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.listarTodas();
    }

    @PostMapping
    public Matricula criar(@RequestBody Matricula matricula) {
        return matriculaService.salvar(matricula);
    }

    @PutMapping("/{id}")
    public Matricula atualizar(@PathVariable Long id, @RequestBody Matricula matricula) {
        return matriculaService.atualizar(id, matricula);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        matriculaService.deletar(id);
    }
}