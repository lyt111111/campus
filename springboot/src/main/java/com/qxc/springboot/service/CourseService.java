package com.qxc.springboot.service;

import com.qxc.springboot.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void insertCourse(Course course);
}
