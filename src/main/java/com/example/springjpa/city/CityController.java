package com.example.springjpa.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/city")
public class CityController {
    CityService cityService;
    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    List<City> getAll(){
        return cityService.getAll();
    }

    @GetMapping("/{id}")
    City findById(@PathVariable String id){
        return cityService.findById(id);
    }

    @PostMapping
    String register(@RequestBody City city){
        return cityService.register(city);
    }
}
