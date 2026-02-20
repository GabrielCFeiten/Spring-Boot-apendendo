package com.cf.school.controllers;

import com.cf.school.models.AlunoModel;
import com.cf.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/school")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findALL(){
        return alunoService.findALL();
    }

    @PostMapping
    public List<AlunoModel> criar(@RequestBody AlunoModel alunoModel){
        return alunoService.criar(alunoModel);
    }

}
