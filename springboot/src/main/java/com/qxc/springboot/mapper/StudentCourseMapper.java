package com.qxc.springboot.mapper;

import com.qxc.springboot.entity.StudentCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentCourseMapper {

    List<StudentCourse> getAllStudentCourses();
    void insertStudentCourse(StudentCourse studentCourse);
}
