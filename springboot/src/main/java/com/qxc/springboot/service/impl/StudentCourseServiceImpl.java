package com.qxc.springboot.service.impl;

import com.qxc.springboot.entity.StudentCourse;
import com.qxc.springboot.mapper.StudentCourseMapper;
import com.qxc.springboot.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Override
    public List<StudentCourse> getAllStudentCourses() {
        return studentCourseMapper.getAllStudentCourses();
    }

    @Override
    public void insertStudentCourse(StudentCourse studentCourse) {
        studentCourseMapper.insertStudentCourse(studentCourse);
    }
}
