package com.qxc.springboot.controller;

import com.qxc.springboot.entity.StudentCourse;
import com.qxc.springboot.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/studentCourse")
@RestController
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @GetMapping("/getAll")
    public List<StudentCourse> getAllStudentCourses() {
        return studentCourseService.getAllStudentCourses();
    }
    @PostMapping("/add")
    public void insertStudentCourse(StudentCourse studentCourse) {
        studentCourseService.insertStudentCourse(studentCourse);
    }
}
