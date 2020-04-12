package com.SpringEx.demo.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacherID;

    private String teacherName;
    private String courses;

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private Set<Teacher> teacher;

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
