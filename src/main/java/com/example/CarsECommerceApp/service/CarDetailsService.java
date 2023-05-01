package com.example.CarsECommerceApp.service;

import com.example.CarsECommerceApp.entity.CarDetails;
import com.example.CarsECommerceApp.repository.CarDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.Arrays;
import java.util.List;

@Service
public class CarDetailsService {


    @Autowired
    private CarDetailsRepository carDetailsRepository;


    public CarDetails addCarDetails(CarDetails carDetails) {
        return carDetailsRepository.save(carDetails);
    }

    public CarDetails getMyCarPurchaseDetails(int id) {
        List desiredColor = Arrays.asList("Pearl White");
        List desiredPayment = Arrays.asList("Online/Debit Card");
        List desiredCity = Arrays.asList("EKM");


        CarDetails cars = carDetailsRepository.findById(id).orElse(null);


        if (cars != null) {
            cars.setColors(desiredColor);
            cars.setPayment(desiredPayment);
            cars.setCities(desiredCity);
        }


        return cars;


    }
}
//    public Cars getMyCarPurchaseDetails(Long id) {
//
//
// List desiredColor = Arrays.asList("Pearl White");
// List desiredPayment = Arrays.asList("Online/Debit Card");
// List desiredCity = Arrays.asList("EKM");
//
//
//
//Cars cars = carRepository.findById(id).orElse(null);
//
// if(cars != null) {
// cars.setColors(desiredColor);
// cars.setPayment(desiredPayment);
// cars.setCities(desiredCity);
// }


// return cars;
//
//
//
// }

