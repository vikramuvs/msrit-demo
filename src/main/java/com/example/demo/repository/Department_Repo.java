package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Department;

@Repository
public interface Department_Repo extends JpaRepository<Department, Integer> {

}
