package com.example.demo.repository;

import com.example.demo.model.VisionMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisionMission_Repo extends JpaRepository<VisionMission, Long> {
}
