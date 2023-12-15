package com.example.springjpa.areaServiceManager;

import com.fasterxml.jackson.databind.JsonSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/area-service-manager")
public class AreaServiceManagerController {

    private final AreaServiceManagerService areaServiceManagerService;
    @Autowired
    public AreaServiceManagerController(AreaServiceManagerService areaServiceManagerService) {
        this.areaServiceManagerService = areaServiceManagerService;
    }

    @GetMapping
    List<AreaServiceManager> getAll(){
        return areaServiceManagerService.getAll();
    }
    @GetMapping("/{id}")
    AreaServiceManager findById(@PathVariable String id){
        return areaServiceManagerService.findById(id);
    }

    @PostMapping
    String register(@RequestBody AreaServiceManager areaServiceManager){
        return areaServiceManagerService.register(areaServiceManager);
    }
}
