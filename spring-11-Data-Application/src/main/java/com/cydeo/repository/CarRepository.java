package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository is not required anymore
public interface CarRepository extends JpaRepository<Car,Long> {
}
