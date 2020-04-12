package com.SpringEx.demo.controller;

import com.SpringEx.demo.model.Teacher;
import com.SpringEx.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;

    @PostMapping("/newTeacher")
    public Teacher createTeacher(@Valid @RequestBody Teacher teacher){
        return teacherRepository.save(teacher);
    }

}
