package com.example.CarsECommerceApp.controller;


import com.example.CarsECommerceApp.entity.CarDetails;
import com.example.CarsECommerceApp.service.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@RequestMapping("/carDetails")
public class CarDetailsController {

    @Autowired
    private CarDetailsService carDetailsService;


    @PostMapping("/cars")
    public CarDetails addCarDetails(@RequestBody CarDetails carDetails)
    {
        return carDetailsService.addCarDetails(carDetails);
    }

    @GetMapping("/cars/{id}")
    public CarDetails getMyCarPurchaseDetails(@PathVariable int id)
    {
        return carDetailsService.getMyCarPurchaseDetails(id);
    }




}
