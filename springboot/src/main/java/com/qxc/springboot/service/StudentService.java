package com.qxc.springboot.service;

import com.qxc.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void insertStudent(Student student);
}
