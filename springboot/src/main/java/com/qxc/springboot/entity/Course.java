package com.qxc.springboot.entity;

import lombok.Data;

@Data
public class Course {
    private Integer courseID;
    private String name;
    private Integer hours;
    private Integer credits;
}

