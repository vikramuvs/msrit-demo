package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_bos_boe")
public class BOS_BOE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private String designation;

    @Column(name = "UG_PG")
    private String UG_PG;

    public BOS_BOE() {
    }

    public BOS_BOE(int departmentId, String name, String designation, String UG_PG) {
        super();
        this.departmentId = departmentId;
        this.name = name;
        this.designation = designation;
        this.UG_PG = UG_PG;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUG_PG() {
        return UG_PG;
    }

    public void setUG_PG(String UG_PG) {
        this.UG_PG = UG_PG;
    }
}
