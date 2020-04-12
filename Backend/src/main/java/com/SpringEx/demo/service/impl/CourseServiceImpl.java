package com.SpringEx.demo.service.impl;

import com.SpringEx.demo.exception.ResourceNotFoundException;
import com.SpringEx.demo.model.Course;
import com.SpringEx.demo.repository.CourseRepository;
import com.SpringEx.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course getCourseByID(Long courseID){
        return courseRepository.findById(courseID).orElseThrow(() -> new ResourceNotFoundException("Course","courseId",courseID)) ;
    }
}
