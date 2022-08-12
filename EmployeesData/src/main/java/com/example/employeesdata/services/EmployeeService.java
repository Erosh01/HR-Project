package com.example.employeesdata.services;


import com.example.employeesdata.entities.Employee;
import com.example.employeesdata.entities.Job;
import com.example.employeesdata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }
    public Employee changeJob(Job job, Long id){
        Employee employee=employeeRepository.findById(id).orElse(null);
        employee.setJob(job);
        return employeeRepository.save(employee);
    }
}
