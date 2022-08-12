package com.example.employeesdata.services;

import com.example.employeesdata.entities.Company;
import com.example.employeesdata.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company addCompany(Company company){
        return companyRepository.save(company);
    }
    public Company getCompanyById(Long id){
        return companyRepository.findById(id).orElse(null);
    }
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
    public void deleteCompanyById(Long id){
        companyRepository.deleteById(id);
    }


}
