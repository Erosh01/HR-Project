package com.example.employeesdata.controllers;


import com.example.employeesdata.entities.Employee;
import com.example.employeesdata.entities.Job;
import com.example.employeesdata.services.EmployeeService;
import com.example.employeesdata.services.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    private JobHistoryService jobHistoryService;
    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/{id}")
    public Employee changeJobEmployee(@PathVariable Long id, @RequestBody Job job){
        return employeeService.changeJob(job,id);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
    }
}
