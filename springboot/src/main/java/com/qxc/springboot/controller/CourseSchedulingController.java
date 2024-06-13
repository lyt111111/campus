package com.qxc.springboot.controller;

import com.qxc.springboot.entity.CourseScheduling;
import com.qxc.springboot.service.CourseSchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/courseScheduling")
public class CourseSchedulingController {
    @Autowired
    private CourseSchedulingService courseSchedulingService;

    @GetMapping("/getAll")
    public List<CourseScheduling> getAllCourseSchedulings() {
        return courseSchedulingService.getAllCourseSchedulings();
    }
    @PostMapping("/add")
    public void insertCourseScheduling(@RequestBody CourseScheduling courseScheduling) {
        courseSchedulingService.insertCourseScheduling(courseScheduling);
    }
}
