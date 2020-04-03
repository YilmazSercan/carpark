package com.bootcamp.demo.entity;

import java.util.Date;

public class Vehicle {
     private String numberPlate;
     private CarType type;
     private String model;
     private String color;
     private Date deadLine;

    public Vehicle(String numberPlate, CarType type, String model, String color, Date deadLine) {
        this.numberPlate = numberPlate;
        this.type = type;
        this.model = model;
        this.color = color;
        this.deadLine = deadLine;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public CarType getType() {
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

    public enum CarType{
         CAR,
         MINIBUS,
         BUS,
         MOTORCYLE,
         CARAVAN
     }
}
