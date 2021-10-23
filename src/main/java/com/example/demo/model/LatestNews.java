package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="tbl_latest_news")
public class LatestNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "is_featured")
    private boolean isFeatured;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "banner_URL")
    private String bannerURL;

    @Column(name = "publisher_Name")
    private String publisherName;

    @Column(name = "link_URL")
    private String linkURL;

    public LatestNews() {
    }

    public LatestNews(boolean isFeatured, int departmentId, Date publishedDate, String title, String description, String bannerURL, String publisherName, String linkURL) {
        super();
        this.isFeatured = isFeatured;
        this.departmentId = departmentId;
        this.publishedDate = publishedDate;
        this.title = title;
        this.description = description;
        this.bannerURL = bannerURL;
        this.publisherName = publisherName;
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

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
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

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }
}
