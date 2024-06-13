package com.qxc.springboot.controller;

import com.qxc.springboot.entity.AcademicStaff;
import com.qxc.springboot.service.AcademicStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/academicStaff")
public class AcademicStaffController {
    @Autowired
    private AcademicStaffService academicStaffService;

    @GetMapping("/getAll")
    public List<AcademicStaff> getAllAcademicStaff(){
        return academicStaffService.getAllAcademicStaff();
    }
    @PostMapping("/add")
    public void insertAcademicStaff(@RequestBody AcademicStaff academicStaff){
        academicStaffService.insertAcademicStaff(academicStaff);
    }
}
