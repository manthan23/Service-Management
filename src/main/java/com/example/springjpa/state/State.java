package com.example.springjpa.state;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "coulson_state")
public class State {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID stateId;

    @Column(name = "state_name")
    private String stateName;

    public State() {
    }

    public State(String stateName) {
        this.stateName = stateName;
    }

    public State(UUID stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public UUID getStateId() {
        return stateId;
    }

    public void setStateId(UUID stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + stateId +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
