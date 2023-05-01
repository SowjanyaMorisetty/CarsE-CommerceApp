package com.example.CarsECommerceApp.repository;

import com.example.CarsECommerceApp.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails,Integer> {
}
