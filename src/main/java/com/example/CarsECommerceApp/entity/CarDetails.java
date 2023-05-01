package com.example.CarsECommerceApp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDetails{

    @Id
    private int carID;
    private String carName;
    private int man_Year;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private Double price;
    @ElementCollection
    private List<String> payment;
    @ElementCollection
    private List<String> cities;


}
