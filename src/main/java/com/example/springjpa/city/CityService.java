package com.example.springjpa.city;

import com.example.springjpa.exception.NotFoundException;
import com.example.springjpa.state.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CityService {
    CityRepository cityRepository;
    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    List<City> getAll(){
        return cityRepository.findAll();
    }

    City findById(String id){
        return cityRepository
                .findById(UUID.fromString(id))
                .orElseThrow(() ->
                new NotFoundException("city with id " + id + " not found"));
    }

    String register(City city){
        Optional<City> stateName = cityRepository.findByCityName(city.getCityName());
        if(stateName.isPresent()){
            return "state already exist";
        }
        cityRepository.save(city);
        return "field successfully added";
    }
}
