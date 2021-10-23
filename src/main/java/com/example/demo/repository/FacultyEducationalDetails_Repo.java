package com.example.demo.repository;

import com.example.demo.model.FacultyEducationalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyEducationalDetails_Repo extends JpaRepository<FacultyEducationalDetails, Long> {
}
