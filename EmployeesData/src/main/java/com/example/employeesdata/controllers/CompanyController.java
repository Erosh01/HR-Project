package com.example.employeesdata.controllers;

import com.example.employeesdata.entities.Company;
import com.example.employeesdata.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @PostMapping()
    public Company addCountry(@RequestBody Company company){

        return companyService.addCompany(company);
    }

    @GetMapping("/{id}")
    public Company getCountry(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }

    @GetMapping()
    public List<Company> getAllCountries(){
        return companyService.getAllCompanies();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        companyService.deleteCompanyById(id);
    }
}
