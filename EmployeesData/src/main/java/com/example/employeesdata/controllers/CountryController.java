package com.example.employeesdata.controllers;

import com.example.employeesdata.entities.City;
import com.example.employeesdata.entities.Country;
import com.example.employeesdata.services.CityService;
import com.example.employeesdata.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private CityService cityService;
    @PostMapping()
    public Country addCountry(@RequestBody Country country){
        if(country.getCities()!=null){
            //country.getCities().stream().forEach(c->c.setCountry(country));
            List<City> cityList=country.getCities();
            cityList.stream().forEach(c->c=cityService.getCityById(c.getId()));
            country.setCities(cityList);
            cityService.updateCities(country.getCities());
        }
        return countryService.addCountry(country);
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable Long id){
        return countryService.getCountryById(id);
    }

    @GetMapping()
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        countryService.deleteCountryById(id);
    }

//    @PutMapping("/Region/updateRegionById/{id}")
//    public Country updateRegionById(@PathVariable Long id, @RequestBody Country region){
//        return countryService.updateCountryById(id,region);
//    }
}
