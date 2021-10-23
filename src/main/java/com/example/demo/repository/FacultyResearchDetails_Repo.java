package com.example.demo.repository;

import com.example.demo.model.FacultyResearchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyResearchDetails_Repo extends JpaRepository<FacultyResearchDetails, Long> {
}
