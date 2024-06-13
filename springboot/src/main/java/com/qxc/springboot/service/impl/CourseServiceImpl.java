package com.qxc.springboot.service.impl;

import com.qxc.springboot.entity.Course;
import com.qxc.springboot.mapper.CourseMapper;
import com.qxc.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAllCourses() {
        return courseMapper.getAllCourses();
    }

    @Override
    public void insertCourse(Course course) {
        courseMapper.insertCourse(course);
    }
}
