package com.basharat.JobPortal.service;



import com.basharat.JobPortal.model.Job;
import com.basharat.JobPortal.model.Employee;
import com.basharat.JobPortal.model.JobCategory;

import java.util.List;
import java.util.Optional;

public interface JobService {
    // Method to add a new job
    Job addJob(Job job);

    // Method to retrieve jobs by the company (Employee)
    List<Job> getJobsByCompany(Employee company);

    // Method to retrieve all jobs
    List<Job> getAllJobs();

    // Method to search jobs based on a keyword in the title or description
    List<Job> searchJobs(String keyword);

    // Method to retrieve jobs by their category
    List<Job> getJobsByCategory(JobCategory category);

    // Method to find a job by its ID
    Optional<Job> findById(Long id);  // Add this method
}
