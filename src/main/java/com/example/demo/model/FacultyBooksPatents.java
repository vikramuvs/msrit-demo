package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_faculty_books_patents")
public class FacultyBooksPatents {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "faculty_id")
    private long facultyId;

    @Column(name = "description")
    private String description;

    public FacultyBooksPatents() {
    }

    public FacultyBooksPatents(long facultyId, String description) {
        super();
        this.facultyId = facultyId;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
