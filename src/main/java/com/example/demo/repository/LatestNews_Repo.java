package com.example.demo.repository;

import com.example.demo.model.LatestNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LatestNews_Repo extends JpaRepository<LatestNews, Long> {
}
