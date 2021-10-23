package com.example.demo.repository;

import com.example.demo.model.FacultyFundedProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyFundedProjects_Repo extends JpaRepository<FacultyFundedProjects, Long> {
}
