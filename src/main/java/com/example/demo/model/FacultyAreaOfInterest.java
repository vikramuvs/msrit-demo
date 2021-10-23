package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_area_of_interest")
public class FacultyAreaOfInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "area_of_interest")
    private String areaOfInterest;

    public FacultyAreaOfInterest() {
    }

    public FacultyAreaOfInterest(long facultyId, String areaOfInterest) {
        super();
        this.facultyId = facultyId;
        this.areaOfInterest = areaOfInterest;
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

    public String getAreaOfInterest() {
        return areaOfInterest;
    }

    public void setAreaOfInterest(String areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }
}
