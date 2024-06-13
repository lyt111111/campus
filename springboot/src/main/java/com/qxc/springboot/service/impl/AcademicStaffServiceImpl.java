package com.qxc.springboot.service.impl;

import com.qxc.springboot.entity.AcademicStaff;
import com.qxc.springboot.mapper.AcademicStaffMapper;
import com.qxc.springboot.service.AcademicStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicStaffServiceImpl implements AcademicStaffService {

    @Autowired
    private AcademicStaffMapper academicStaffMapper;

    @Override
    public List<AcademicStaff> getAllAcademicStaff() {
        return academicStaffMapper.getAllAcademicStaff();
    }

    @Override
    public void insertAcademicStaff(AcademicStaff academicStaff) {
        academicStaffMapper.insertAcademicStaff(academicStaff);
    }
}
