package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_funded_projects")
public class FacultyFundedProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "title_of_project")
    private String titleOfProject;

    @Column(name = "funding_agency")
    private String fundingAgency;

    @Column(name = "from_duration")
    private int fromDuration;

    @Column(name = "to_duration")
    private int toDuration;

    public FacultyFundedProjects() {
    }

    public FacultyFundedProjects(long facultyId, String titleOfProject, String fundingAgency, int fromDuration, int toDuration) {
        super();
        this.facultyId = facultyId;
        this.titleOfProject = titleOfProject;
        this.fundingAgency = fundingAgency;
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

    public String getTitleOfProject() {
        return titleOfProject;
    }

    public void setTitleOfProject(String titleOfProject) {
        this.titleOfProject = titleOfProject;
    }

    public String getFundingAgency() {
        return fundingAgency;
    }

    public void setFundingAgency(String fundingAgency) {
        this.fundingAgency = fundingAgency;
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
