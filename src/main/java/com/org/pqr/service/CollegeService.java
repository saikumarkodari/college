package com.org.pqr.service;

import com.org.pqr.model.College;
import org.springframework.web.bind.annotation.RequestBody;

public interface CollegeService {

    public void createCollegeRepo( College college);
}
