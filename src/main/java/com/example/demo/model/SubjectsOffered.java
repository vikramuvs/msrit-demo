package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class SubjectsOffered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "credits")
    private int credits;

    public SubjectsOffered() {
    }

    public SubjectsOffered(String subjectCode, String subjectName, int departmentId, int credits) {
        super();
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.departmentId = departmentId;
        this.credits = credits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
