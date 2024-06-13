package com.qxc.springboot.entity;

import lombok.Data;

@Data
public class CourseScheduling {
    private Integer teacherID;
    private Integer academicStaffID;
    private Integer courseID;
    private String classTime;
}
