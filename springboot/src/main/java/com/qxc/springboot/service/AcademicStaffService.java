package com.qxc.springboot.service;

import com.qxc.springboot.entity.AcademicStaff;

import java.util.List;

public interface AcademicStaffService {
    List<AcademicStaff> getAllAcademicStaff();
    void insertAcademicStaff(AcademicStaff academicStaff);
}
