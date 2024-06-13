package com.qxc.springboot.mapper;

import com.qxc.springboot.entity.AcademicStaff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcademicStaffMapper {
    List<AcademicStaff> getAllAcademicStaff();
    void insertAcademicStaff(AcademicStaff academicStaff);
}
