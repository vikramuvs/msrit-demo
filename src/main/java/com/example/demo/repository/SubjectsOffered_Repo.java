package com.example.demo.repository;

import com.example.demo.model.SubjectsOffered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsOffered_Repo extends JpaRepository<SubjectsOffered, Long> {
}
