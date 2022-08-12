package com.example.employeesdata.services;

import com.example.employeesdata.entities.City;
import com.example.employeesdata.entities.Company;
import com.example.employeesdata.entities.Country;
import com.example.employeesdata.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void deleteCityById(Long id) {
        cityRepository.deleteById(id);
    }

    public City updateCity(City city) {
        if (getCityById(city.getId()) == null) return addCity(city);
        else {
            return cityRepository.save(city);
        }
    }

    public void updateCities(List<City> cities) {
        cities.stream().forEach(c -> updateCity(c));
    }

    public void addCountryToCities(Country country){
        List<City> cities=cityRepository.findAll();
        for(City city: country.getCities()){
            for(City city1: cities){
                if(city.getId().equals(city1)){
                    city1.setCountry(country);
                    break;
                }
            }
        }
        cityRepository.saveAll(cities);
    }
    public City addCompaniesToCityById(Long id, List<Company> companies){
        City city=cityRepository.findById(id).orElse(null);
        city.setCompanies(companies);
        return cityRepository.save(city);
    }
}
