package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class FacultyResearchDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "noStudents_guided")
    private int noStudentsGuided;

    @Column(name = "have_any_research_pub")
    private boolean haveAnyResearchPub;

    @Column(name = "research_publication")
    private String researchPublication;

    public FacultyResearchDetails() {
    }

    public FacultyResearchDetails(long facultyId, int noStudentsGuided, boolean haveAnyResearchPub, String researchPublication) {
        super();
        this.facultyId = facultyId;
        this.noStudentsGuided = noStudentsGuided;
        this.haveAnyResearchPub = haveAnyResearchPub;
        this.researchPublication = researchPublication;
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

    public int getNoStudentsGuided() {
        return noStudentsGuided;
    }

    public void setNoStudentsGuided(int noStudentsGuided) {
        this.noStudentsGuided = noStudentsGuided;
    }

    public boolean isHaveAnyResearchPub() {
        return haveAnyResearchPub;
    }

    public void setHaveAnyResearchPub(boolean haveAnyResearchPub) {
        this.haveAnyResearchPub = haveAnyResearchPub;
    }

    public String getResearchPublication() {
        return researchPublication;
    }

    public void setResearchPublication(String researchPublication) {
        this.researchPublication = researchPublication;
    }
}
