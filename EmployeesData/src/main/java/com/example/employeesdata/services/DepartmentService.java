package com.example.employeesdata.services;

import com.example.employeesdata.entities.Department;
import com.example.employeesdata.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }
    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).orElse(null);
    }
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public void deleteDepartmentById(Long id){
        departmentRepository.deleteById(id);
    }
}
