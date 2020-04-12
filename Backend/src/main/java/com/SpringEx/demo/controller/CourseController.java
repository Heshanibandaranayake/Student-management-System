package com.SpringEx.demo.controller;

import com.SpringEx.demo.model.Course;
import com.SpringEx.demo.repository.CourseRepository;
import com.SpringEx.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseService courseService;

    @PostMapping("/newCourse")
    public Course createNewCourse(@Valid @RequestBody Course course){
        return courseRepository.save(course);
    }

    @GetMapping("/getCourseById/{courseID}")
    public Course getCourseByID(@PathVariable(value = "courseID") Long courseID){
        return courseService.getCourseByID(courseID);
    }
}
