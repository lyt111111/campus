package com.qxc.springboot.entity;

import lombok.Data;

@Data
public class AcademicStaff {
    private Integer academicStaffID;
    private String gender;
    private Integer age;
    private String identificationNumber;
    private String name;
    private String department;
    private String password;
    private String email;
    private String phoneNumber;
}
