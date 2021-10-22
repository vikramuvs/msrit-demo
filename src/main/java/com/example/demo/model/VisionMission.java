package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class VisionMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "vision")
    private String vision;

    @Column(name = "mission")
    private String mission;

    public VisionMission() {
    }

    public VisionMission(int departmentId, String vision, String mission) {
        super();
        this.departmentId = departmentId;
        this.vision = vision;
        this.mission = mission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
