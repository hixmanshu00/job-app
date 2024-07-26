package com.java.jobApp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.java.jobApp.job.Job;
import com.java.jobApp.review.Review;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;

    public Company() {
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
