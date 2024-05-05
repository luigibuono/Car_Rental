package com.project.entities;

import jakarta.persistence.*;
import lombok.Data;

import com.project.dtos.CarDto;

@Entity
@Data
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String color;

    private String transmission;

    private String brand;

    private String type;

    private String modelYear;

    private String description;

    private Integer price;
    
    private String employee;
    
    private String dealership;

    @Column(columnDefinition = "longblob")
    private byte[] image;

    public CarDto getCarDto() {
        CarDto carDto = new CarDto();
        carDto.setId(id);
        carDto.setName(name);
        carDto.setDescription(description);
        carDto.setColor(color);
        carDto.setType(type);
        carDto.setPrice(price);
        carDto.setTransmission(transmission);
        carDto.setModelYear(modelYear);
        carDto.setBrand(brand);
        carDto.setReturnedImage(image);
        carDto.setEmployee(employee);
        carDto.setDealership(dealership);
        return carDto;
    }


}