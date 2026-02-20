package com.cf.school.services;

import com.cf.school.models.ProfessorModel;
import com.cf.school.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorModel> findAll(){
        return professorRepository.findAll();
    }
}
