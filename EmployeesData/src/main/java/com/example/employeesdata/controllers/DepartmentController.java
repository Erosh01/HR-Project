package com.example.employeesdata.controllers;

import com.example.employeesdata.entities.Department;
import com.example.employeesdata.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping()
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }

    @GetMapping()
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
    }
}
