package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_teaching_subject")
public class FacultyTeachingSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "subject_id")
    private long subjectId;

    public FacultyTeachingSubject() {
    }

    public FacultyTeachingSubject(long facultyId, long subjectId) {
        super();
        this.facultyId = facultyId;
        this.subjectId = subjectId;
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

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }
}
