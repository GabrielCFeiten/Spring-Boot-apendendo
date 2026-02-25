package com.cf.school.controllers;

import com.cf.school.models.AlunoModel;
import com.cf.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll() {
        return alunoService.findAll();
    }

    @PostMapping
    public AlunoModel criar(@RequestBody AlunoModel alunoModel) {
        return alunoService.criar(alunoModel);
    }
}
