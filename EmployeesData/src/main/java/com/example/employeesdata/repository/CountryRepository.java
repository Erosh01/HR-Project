package com.example.employeesdata.repository;

import com.example.employeesdata.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
