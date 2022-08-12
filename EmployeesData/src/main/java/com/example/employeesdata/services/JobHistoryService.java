package com.example.employeesdata.services;
import com.example.employeesdata.entities.JobHistory;
import com.example.employeesdata.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryService {
    @Autowired
    JobHistoryRepository jobHistoryRepository;

    public JobHistory addJobHistory(JobHistory job){
        return jobHistoryRepository.save(job);
    }
    public JobHistory getJobHistoryById(Long id){
        return jobHistoryRepository.findById(id).orElse(null);
    }
    public List<JobHistory> getAllJobHistories(){
        return jobHistoryRepository.findAll();
    }
    public void deleteJobHistoryById(Long id){
        jobHistoryRepository.deleteById(id);
    }
//    public JobHistory  getJobHistoryByEmployeeId(Long id){
//        return jobHistoryRepository.findByemployee_id(id);
//    }

}
