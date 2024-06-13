package com.qxc.springboot.controller;

import com.qxc.springboot.entity.Course;
import com.qxc.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getAll")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/add")
    public void insertCourse(@RequestBody Course course) {
        courseService.insertCourse(course);
    }

}
