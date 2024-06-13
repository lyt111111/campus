package com.qxc.springboot.service.impl;

import com.qxc.springboot.entity.Student;
import com.qxc.springboot.mapper.StudentMapper;
import com.qxc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }
}
