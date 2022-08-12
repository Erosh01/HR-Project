package com.example.employeesdata.services;

import com.example.employeesdata.entities.Job;
import com.example.employeesdata.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job addJob(Job job){
        return jobRepository.save(job);
    }
    public Job getJobById(Long id){
        return jobRepository.findById(id).orElse(null);
    }
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }
    public void deleteJobById(Long id){
        jobRepository.deleteById(id);
    }
}
