package com.qxc.springboot.mapper;

import com.qxc.springboot.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<Course> getAllCourses();
    void insertCourse(Course course);
}
