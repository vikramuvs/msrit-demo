package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class FacultyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "designation")
    private String designation;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "highest_qualification")
    private String highestQualification;

    @Column(name = "date_of_joining")
    private String dateOfJoining;

    @Column(name = "profile_pic_url")
    private String profilePicURL;

    @Column(name = "teaching_or_not")
    private String teachingOrNot;

    @Column(name = "present_area_of_interest")
    private String presentAreaOfInterest;

    @Column(name = "short_bio")
    private String shortBio;

    public FacultyDetails() {
    }

    public FacultyDetails(String fullName, String emailId, String phoneNo, String designation, int departmentId, String highestQualification, String dateOfJoining, String profilePicURL, String teachingOrNot, String presentAreaOfInterest, String shortBio) {
        super();
        this.fullName = fullName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.designation = designation;
        this.departmentId = departmentId;
        this.highestQualification = highestQualification;
        this.dateOfJoining = dateOfJoining;
        this.profilePicURL = profilePicURL;
        this.teachingOrNot = teachingOrNot;
        this.presentAreaOfInterest = presentAreaOfInterest;
        this.shortBio = shortBio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    public String getTeachingOrNot() {
        return teachingOrNot;
    }

    public void setTeachingOrNot(String teachingOrNot) {
        this.teachingOrNot = teachingOrNot;
    }

    public String getPresentAreaOfInterest() {
        return presentAreaOfInterest;
    }

    public void setPresentAreaOfInterest(String presentAreaOfInterest) {
        this.presentAreaOfInterest = presentAreaOfInterest;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }
}
