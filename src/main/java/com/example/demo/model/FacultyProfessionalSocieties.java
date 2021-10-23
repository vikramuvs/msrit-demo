package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_professional_societies")
public class FacultyProfessionalSocieties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "society_name")
    private String societyName;

    public FacultyProfessionalSocieties() {
    }

    public FacultyProfessionalSocieties(long facultyId, String societyName) {
        super();
        this.facultyId = facultyId;
        this.societyName = societyName;
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

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }
}
