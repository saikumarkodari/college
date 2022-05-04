package com.org.pqr.service;

import com.org.pqr.model.College;
import com.org.pqr.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CollegeServiceImpl implements CollegeService {
@Autowired
CollegeRepo collegeRepo;
    @Override
    public void createCollegeRepo(College college) {
        collegeRepo.save(college);
    }
}
