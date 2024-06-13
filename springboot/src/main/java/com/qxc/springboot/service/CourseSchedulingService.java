package com.qxc.springboot.service;

import com.qxc.springboot.entity.CourseScheduling;

import java.util.List;

public interface CourseSchedulingService {
    List<CourseScheduling> getAllCourseSchedulings();
    void insertCourseScheduling(CourseScheduling courseScheduling);
}
