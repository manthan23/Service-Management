package com.example.springjpa.areaServiceManager;

import com.example.springjpa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AreaServiceManagerService {
    private final AreaServiceMangerRepository areaServiceMangerRepository;
    @Autowired
    public AreaServiceManagerService(AreaServiceMangerRepository areaServiceMangerRepository) {
        this.areaServiceMangerRepository = areaServiceMangerRepository;
    }


    public List<AreaServiceManager> getAll() {
        return areaServiceMangerRepository.findAll();
    }

    public AreaServiceManager findById(String id) {
        return areaServiceMangerRepository.findById(UUID.fromString(id)).orElseThrow(
                ()-> new NotFoundException("area service manager with id "+id +"does not exist")
        );
    }

    public String register(AreaServiceManager areaServiceManager) {
        String email = areaServiceManager.getEmail();
        Optional<AreaServiceManager> optional = areaServiceMangerRepository.findByEmail(email);
        if(optional.isPresent()){
            return "area service manager with id "+email +"does not exist";
        }
        areaServiceMangerRepository.save(areaServiceManager);
        return "successful";
    }
}
