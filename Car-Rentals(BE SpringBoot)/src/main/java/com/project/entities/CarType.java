package com.project.entities;

import jakarta.persistence.*;
import lombok.Data;
import com.project.dtos.CarTypeDto;
@Entity
@Data
@Table(name = "car_types")
public class CarType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Integer price;
    
    public CarTypeDto getCarType() {
    	CarTypeDto carType = new CarTypeDto();
    	carType.setId(id);
    	carType.setDescription(description);
    	carType.setPrice(price);
        return carType;
    }

}
