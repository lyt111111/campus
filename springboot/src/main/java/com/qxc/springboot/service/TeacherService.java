package com.qxc.springboot.service;

import com.qxc.springboot.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    void insertTeacher(Teacher teacher);
}
