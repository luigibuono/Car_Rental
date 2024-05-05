package com.project.entities;

import com.project.dtos.CarDealershipDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dealerships")
public class Dealership {


	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
    private String employee;
	
    private String dealership;
    
    public CarDealershipDto getCarDealership() {
    	CarDealershipDto carDealership = new CarDealershipDto();
    	carDealership.setId(id);
    	carDealership.setEmployee(employee);
    	carDealership.setDealership(dealership);
        return carDealership;
    }
}