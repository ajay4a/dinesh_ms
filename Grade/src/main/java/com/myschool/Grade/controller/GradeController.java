package com.myschool.Grade.controller;

import com.myschool.Grade.model.Grade;
import com.myschool.Grade.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeRepository repository;


    @PostMapping
    public Grade addGrade(@RequestBody Grade grade){
        return repository.save(grade);
    }

    @GetMapping("/{id}")
    public Grade addGrade(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }


}
