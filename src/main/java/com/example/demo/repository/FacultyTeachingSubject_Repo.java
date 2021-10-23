package com.example.demo.repository;

import com.example.demo.model.FacultyTeachingSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyTeachingSubject_Repo extends JpaRepository<FacultyTeachingSubject, Long> {
}
