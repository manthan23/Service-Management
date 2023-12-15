package com.example.springjpa.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/state")
public class StateController {

    private StateService stateService;
    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping
    public List<State> getAll() {
        return stateService.getAllState();
    }
    @GetMapping("/{id}")
    public State findById(@PathVariable String id){
        return stateService.findById(id);
    }

    @PostMapping
    public String addState(@RequestBody State state){
        return stateService.addState(state);
    }



}
