package com.myschool.Student.controller;

import com.myschool.Student.model.Student;
import com.myschool.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }

/*    @GetMapping("/")
    public Student getStudent(){
        Student st = new Student();
        st.
        return new Student(1,"Dines",2);
    }*/
}
