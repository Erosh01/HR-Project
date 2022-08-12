package com.example.employeesdata.services;

import com.example.employeesdata.entities.Country;
import com.example.employeesdata.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository repository;

    public Country addCountry(Country country) {

        return repository.save(country);
    }

    public Country getCountryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public void deleteCountryById(Long id) {
        repository.deleteById(id);
    }
}
