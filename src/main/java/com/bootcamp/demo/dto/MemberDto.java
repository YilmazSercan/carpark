package com.bootcamp.demo.dto;

import java.util.List;

public class MemberDto {
    private String name;
    private String phoneNumber;
    private String address;
    private List<VehicleDto> vehicles;

    public MemberDto(String name, String phoneNumber, String address, List<VehicleDto> vehicles) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.vehicles = vehicles;
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

    public List<VehicleDto> getVehicles() {
        return vehicles;
    }
}
