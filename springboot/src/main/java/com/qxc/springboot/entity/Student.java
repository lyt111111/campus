package com.qxc.springboot.entity;

import lombok.Data;

@Data
public class Student {
    private Integer studentID;
    private String password;
    private String gender;
    private Integer age;
    private String identificationNumber;
    private String name;
    private String department;
    private String email;
    private String dormitoryNumber;
    private String phoneNumber;
    private String clazz;
}
