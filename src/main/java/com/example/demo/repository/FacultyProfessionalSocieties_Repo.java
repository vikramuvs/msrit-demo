package com.example.demo.repository;

import com.example.demo.model.FacultyProfessionalSocieties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyProfessionalSocieties_Repo extends JpaRepository<FacultyProfessionalSocieties, Long> {
}
