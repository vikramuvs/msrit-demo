package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class SideHeadings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "side_heading_type")
    private int sideHeadingType; // 1 for Syllabus, 2 for Study Materials, 3 for Time-table

    @Column(name = "link_title")
    private String linkTitle;

    @Column(name = "link_URL")
    private String linkURL;

    public SideHeadings() {
    }

    public SideHeadings(int departmentId, int sideHeadingType, String linkTitle, String linkURL) {
        super();
        this.departmentId = departmentId;
        this.sideHeadingType = sideHeadingType;
        this.linkTitle = linkTitle;
        this.linkURL = linkURL;
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

    public int getSideHeadingType() {
        return sideHeadingType;
    }

    public void setSideHeadingType(int sideHeadingType) {
        this.sideHeadingType = sideHeadingType;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }
}
