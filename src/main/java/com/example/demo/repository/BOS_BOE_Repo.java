package com.example.demo.repository;

import com.example.demo.model.BOS_BOE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BOS_BOE_Repo extends JpaRepository<BOS_BOE, Long> {
}
