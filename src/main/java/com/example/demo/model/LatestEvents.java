package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_latest_events")
public class LatestEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "is_featured")
    private boolean isFeatured;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "title")
    private String title;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(name = "description")
    private String description;

    @Column(name = "banner_URL")
    private String bannerURL;

    @Column(name = "publisher_name")
    private String publisherName;

    @Column(name = "event_start_date")
    private Date eventStartDate;

    @Column(name = "event_end_date")
    private Date eventEndDate;

    @Column(name = "location")
    private String location;

    @Column(name = "link_URL")
    private String linkURL;

    public LatestEvents() {
    }

    public LatestEvents(boolean isFeatured, int departmentId, String title, Date publishedDate, String description, String bannerURL, String publisherName, Date eventStartDate, Date eventEndDate, String location, String linkURL) {
        super();
        this.isFeatured = isFeatured;
        this.departmentId = departmentId;
        this.title = title;
        this.publishedDate = publishedDate;
        this.description = description;
        this.bannerURL = bannerURL;
        this.publisherName = publisherName;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.location = location;
        this.linkURL = linkURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBannerURL() {
        return bannerURL;
    }

    public void setBannerURL(String bannerURL) {
        this.bannerURL = bannerURL;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Date getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }
}
