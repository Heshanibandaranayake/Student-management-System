package com.SpringEx.demo.service.impl;

import com.SpringEx.demo.exception.ResourceNotFoundException;
import com.SpringEx.demo.model.Student;
import com.SpringEx.demo.repository.StudentRepository;
import com.SpringEx.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
    }
}
