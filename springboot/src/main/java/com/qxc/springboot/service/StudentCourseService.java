package com.qxc.springboot.service;

import com.qxc.springboot.entity.StudentCourse;

import java.util.List;

public interface StudentCourseService {
    List<StudentCourse> getAllStudentCourses();
    void insertStudentCourse(StudentCourse studentCourse);
}
