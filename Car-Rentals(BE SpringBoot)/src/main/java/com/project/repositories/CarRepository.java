package com.project.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}

