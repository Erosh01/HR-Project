package com.example.employeesdata.repository;

import com.example.employeesdata.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
}
