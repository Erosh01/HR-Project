package com.example.employeesdata.controllers;


import com.example.employeesdata.entities.JobHistory;
import com.example.employeesdata.services.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobHistory")
public class JobHistoryController {

    @Autowired
    private JobHistoryService jobHistoryService;

    @PostMapping()
    public JobHistory addCountry(@RequestBody JobHistory jobHistory){
        return jobHistoryService.addJobHistory(jobHistory);
    }

    @GetMapping("/{id}")
    public  JobHistory getCountry(@PathVariable Long id){
        return jobHistoryService.getJobHistoryById(id);
    }

    @GetMapping()
    public List< JobHistory> getAllCountries(){
        return jobHistoryService.getAllJobHistories();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        jobHistoryService.deleteJobHistoryById(id);
    }

}
