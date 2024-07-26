package com.java.jobApp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void addJob(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
