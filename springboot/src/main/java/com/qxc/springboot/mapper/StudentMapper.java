package com.qxc.springboot.mapper;

import com.qxc.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudents();
    void insertStudent(Student student);
}
