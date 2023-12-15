package com.example.springjpa.areaServiceManager;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "")
public class AreaServiceManager {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String email;
    private String asm_id;
    private String phone_number;

    public AreaServiceManager() {
    }

    public AreaServiceManager(String name, String email, String asm_id, String phone_number) {
        this.name = name;
        this.email = email;
        this.asm_id = asm_id;
        this.phone_number = phone_number;
    }

    public AreaServiceManager(UUID id, String name, String email, String asm_id, String phone_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.asm_id = asm_id;
        this.phone_number = phone_number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsm_id() {
        return asm_id;
    }

    public void setAsm_id(String asm_id) {
        this.asm_id = asm_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "AreaServiceManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", asm_id='" + asm_id + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
