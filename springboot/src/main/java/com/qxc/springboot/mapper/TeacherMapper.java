package com.qxc.springboot.mapper;

import com.qxc.springboot.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List<Teacher> getAllTeachers();
    void insertTeacher(Teacher teacher);
}
