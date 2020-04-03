package com.bootcamp.demo.entity;

import java.util.List;
import java.util.UUID;

public class Member {

    private UUID id;
    private String name;
    private String phoneNumber;
    private String address;
    private List<Vehicle> vehicles;
    private Vehicle car;

    public Member(String name, String phoneNumber, String address, List<Vehicle> vehicles) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.vehicles = vehicles;

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
