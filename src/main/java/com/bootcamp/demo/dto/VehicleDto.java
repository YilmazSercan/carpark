package com.bootcamp.demo.dto;

import com.bootcamp.demo.entity.Vehicle;

import java.util.Date;

public class VehicleDto {
    private String numberPlate;
    private Vehicle.CarType type;
    private String model;
    private String color;
    private Date deadLine;

    public VehicleDto(String numberPlate, Vehicle.CarType type, String model
            , String color, Date deadLine) {
        this.numberPlate = numberPlate;
        this.type = type;
        this.model = model;
        this.color = color;
        this.deadLine = deadLine;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public Vehicle.CarType getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Date getDeadLine() {
        return deadLine;
    }
}
