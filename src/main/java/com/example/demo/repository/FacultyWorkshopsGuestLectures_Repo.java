package com.example.demo.repository;

import com.example.demo.model.FacultyWorkshopsGuestLectures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyWorkshopsGuestLectures_Repo extends JpaRepository<FacultyWorkshopsGuestLectures, Long > {
}
