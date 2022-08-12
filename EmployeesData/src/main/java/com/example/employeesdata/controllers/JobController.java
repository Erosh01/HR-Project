package com.example.employeesdata.controllers;

import com.example.employeesdata.entities.Job;
import com.example.employeesdata.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping()
    public Job addCountry(@RequestBody Job job){
        return jobService.addJob(job);
    }

    @GetMapping("/{id}")
    public Job getCountry(@PathVariable Long id){
        return jobService.getJobById(id);
    }

    @GetMapping()
    public List<Job> getAllCountries(){
        return jobService.getAllJobs();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        jobService.deleteJobById(id);
    }
}
