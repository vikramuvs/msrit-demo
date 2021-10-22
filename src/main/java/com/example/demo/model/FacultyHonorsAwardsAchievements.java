package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class FacultyHonorsAwardsAchievements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "achievement_details")
    private String achievementDetails;

    public FacultyHonorsAwardsAchievements() {
    }

    public FacultyHonorsAwardsAchievements(long facultyId, String achievementDetails) {
        super();
        this.facultyId = facultyId;
        this.achievementDetails = achievementDetails;
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

    public String getAchievementDetails() {
        return achievementDetails;
    }

    public void setAchievementDetails(String achievementDetails) {
        this.achievementDetails = achievementDetails;
    }
}
