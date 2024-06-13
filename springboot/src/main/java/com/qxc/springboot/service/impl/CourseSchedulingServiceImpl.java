package com.qxc.springboot.service.impl;


import com.qxc.springboot.entity.CourseScheduling;
import com.qxc.springboot.mapper.CourseSchedulingMapper;
import com.qxc.springboot.service.CourseSchedulingService;
import com.qxc.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSchedulingServiceImpl implements CourseSchedulingService{
    @Autowired
    private CourseSchedulingMapper courseSchedulingMapper;

    @Override
    public List<CourseScheduling> getAllCourseSchedulings() {
        return courseSchedulingMapper.getAllCourseSchedulings();
    }

    @Override
    public void insertCourseScheduling(CourseScheduling courseScheduling) {
        courseSchedulingMapper.insertCourseScheduling(courseScheduling);
    }
}
