package com.example.springjpa.state;

import com.example.springjpa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class StateService {
    StateRepository stateRepository;
    @Autowired
    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    List<State> getAllState(){
        return stateRepository.findAll();
    }

    String addState(State state){
        Optional<State> stateName = stateRepository.findByStateName(state.getStateName());
        if(stateName.isPresent()){
           return "state already exist";
        }
        stateRepository.save(state);
        return "field successfully added";
    }

    public State findById(String id) {
        return stateRepository
                .findById(UUID.fromString(id))
                .orElseThrow(
                        () -> new NotFoundException(
                                "state with id " + id + " not found"));


    }
}
