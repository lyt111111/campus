package com.qxc.springboot.controller;

import com.qxc.springboot.entity.Teacher;
import com.qxc.springboot.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/teacher")
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getAll")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @PostMapping("/add")
    public void insertTeacher(Teacher teacher) {
        teacherService.insertTeacher(teacher);
    }
}
