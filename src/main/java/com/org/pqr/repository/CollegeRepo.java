package com.org.pqr.repository;

import com.org.pqr.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CollegeRepo extends JpaRepository<College,Integer> {
}
