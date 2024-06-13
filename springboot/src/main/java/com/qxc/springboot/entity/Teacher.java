package com.qxc.springboot.entity;

import lombok.Data;

@Data
public class Teacher {
    private Integer teacherID;
    private String password;
    private String gender;
    private Integer age;
    private String identificationNumber;
    private String name;
    private String department;
    private String title;
    private String email;
    private String phoneNumber;
}
