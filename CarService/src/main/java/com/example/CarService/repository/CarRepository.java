package com.example.CarService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CarService.entities.Car;



public interface CarRepository extends JpaRepository<Car,Long>  {

	
}
