package com.example.employeesdata.repository;

import com.example.employeesdata.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company,Long> {
}
