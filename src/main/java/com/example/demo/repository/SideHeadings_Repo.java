package com.example.demo.repository;

import com.example.demo.model.SideHeadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SideHeadings_Repo extends JpaRepository<SideHeadings, Integer> {
}
