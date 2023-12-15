package com.example.springjpa.city;

import com.example.springjpa.state.State;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "coulson_city")
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cityId;

    @Column(name = "city_name")
    private String cityName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id")
    private State state;

    public City() {
    }

    public City(String cityName, State state) {
        this.cityName = cityName;
        this.state = state;
    }

    public City(UUID cityId, String cityName, State state) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.state = state;
    }

    public UUID getCityId() {
        return cityId;
    }

    public void setCityId(UUID cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", state=" + state +
                '}';
    }
}
