package com.qxc.springboot.controller;

import com.qxc.springboot.entity.Student;
import com.qxc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping("/add")
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }
}
