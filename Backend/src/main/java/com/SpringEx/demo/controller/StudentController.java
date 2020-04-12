package com.SpringEx.demo.controller;

import com.SpringEx.demo.model.Student;
import com.SpringEx.demo.repository.StudentRepository;
import com.SpringEx.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @PostMapping("/newStudent")
    public Student createStudent(@Valid @RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable(value = "id") Long id){
        return studentService.getStudentById(id);
    }

}
