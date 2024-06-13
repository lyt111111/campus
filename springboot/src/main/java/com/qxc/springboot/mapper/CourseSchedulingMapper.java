package com.qxc.springboot.mapper;


import com.qxc.springboot.entity.CourseScheduling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseSchedulingMapper {
    List<CourseScheduling> getAllCourseSchedulings();
    void insertCourseScheduling(CourseScheduling courseScheduling);
}
