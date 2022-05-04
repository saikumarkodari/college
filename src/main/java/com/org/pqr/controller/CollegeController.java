package com.org.pqr.controller;

import com.org.pqr.model.College;
import com.org.pqr.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CollegeController {

    @Autowired
    CollegeService collegeService;


    @PostMapping("/create")
    public void createCollegeRepo(@RequestBody College college){
        collegeService.createCollegeRepo(college);
    }
}
