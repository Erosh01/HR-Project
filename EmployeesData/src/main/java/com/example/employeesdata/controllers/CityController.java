package com.example.employeesdata.controllers;

import com.example.employeesdata.entities.City;
import com.example.employeesdata.entities.Company;
import com.example.employeesdata.repository.CityRepository;
import com.example.employeesdata.services.CityService;
import com.example.employeesdata.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;
    @Autowired
    private CompanyService companyService;
    @PostMapping()
    public City addCity(@RequestBody City city){

        return cityService.addCity(city);
    }

    @GetMapping("/{id}")
    public City getCountry(@PathVariable Long id){
        return cityService.getCityById(id);
    }

    @GetMapping()
    public List<City> getAllCountries(){
        return cityService.getAllCities();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        cityService.deleteCityById(id);
    }

    @PostMapping("/addCompany/{id}")
    public City addCompaniesToCity(@RequestBody List<Company> companies,@PathVariable Long id){
        if(cityService.getCityById(id).getCompanies()!=null){
            return cityService.addCompaniesToCityById(id,companies);
        }
        else return null;
    }
}
