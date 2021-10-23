package com.example.demo.controller;

import com.example.demo.model.BOS_BOE;
import com.example.demo.model.Department;
import com.example.demo.repository.BOS_BOE_Repo;
import com.example.demo.repository.Department_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BOS_BOE_Controller {
    @Autowired
    private BOS_BOE_Repo bos_boe;

    @Autowired
    private Department_Repo dept;

    @GetMapping("/bos_boe/")
    public List<BOS_BOE> getBOS_BOE() {
        return bos_boe.findAll();
    }

    @GetMapping("/dept/")
    public List<Department> getDepartment() {
        return dept.findAll();
    }
}
