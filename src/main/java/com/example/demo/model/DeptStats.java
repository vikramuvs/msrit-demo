package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class DeptStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "field_heading")
    private String fieldHeading;

    @Column(name = "field_sub_heading")
    private String fieldSubHeading;

    public DeptStats() {
    }

    public DeptStats(int departmentId, String fieldHeading, String fieldSubHeading) {
        super();
        this.departmentId = departmentId;
        this.fieldHeading = fieldHeading;
        this.fieldSubHeading = fieldSubHeading;
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

    public String getFieldHeading() {
        return fieldHeading;
    }

    public void setFieldHeading(String fieldHeading) {
        this.fieldHeading = fieldHeading;
    }

    public String getFieldSubHeading() {
        return fieldSubHeading;
    }

    public void setFieldSubHeading(String fieldSubHeading) {
        this.fieldSubHeading = fieldSubHeading;
    }
}
