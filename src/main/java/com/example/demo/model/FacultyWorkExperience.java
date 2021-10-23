package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_work_experience")
public class FacultyWorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "designation")
    private String designation;

    @Column(name = "place_of_work")
    private String placeOfWork;

    @Column(name = "from_duration")
    private int fromDuration;

    @Column(name = "to_duration")
    private int toDuration;

    public FacultyWorkExperience() {
    }

    public FacultyWorkExperience(long facultyId, String designation, String placeOfWork, int fromDuration, int toDuration) {
        super();
        this.facultyId = facultyId;
        this.designation = designation;
        this.placeOfWork = placeOfWork;
        this.fromDuration = fromDuration;
        this.toDuration = toDuration;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getFromDuration() {
        return fromDuration;
    }

    public void setFromDuration(int fromDuration) {
        this.fromDuration = fromDuration;
    }

    public int getToDuration() {
        return toDuration;
    }

    public void setToDuration(int toDuration) {
        this.toDuration = toDuration;
    }
}
