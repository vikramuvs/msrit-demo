package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_educational_details")
public class FacultyEducationalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "degree")
    private String degree;

    @Column(name = "year_of_completion")
    private int yearOfCompletion;

    @Column(name = "university")
    private String university;

    public FacultyEducationalDetails() {
    }

    public FacultyEducationalDetails(long facultyId, String degree, int yearOfCompletion, String university) {
        super();
        this.facultyId = facultyId;
        this.degree = degree;
        this.yearOfCompletion = yearOfCompletion;
        this.university = university;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYearOfCompletion() {
        return yearOfCompletion;
    }

    public void setYearOfCompletion(int yearOfCompletion) {
        this.yearOfCompletion = yearOfCompletion;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
