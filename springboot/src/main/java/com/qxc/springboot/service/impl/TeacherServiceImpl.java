package com.qxc.springboot.service.impl;

import com.qxc.springboot.entity.Teacher;
import com.qxc.springboot.mapper.TeacherMapper;
import com.qxc.springboot.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        teacherMapper.insertTeacher(teacher);
    }
}
