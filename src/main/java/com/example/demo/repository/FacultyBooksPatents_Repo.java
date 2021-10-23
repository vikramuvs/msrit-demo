package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.FacultyBooksPatents;

@Repository
public interface FacultyBooksPatents_Repo extends JpaRepository<FacultyBooksPatents, Long> {
}
