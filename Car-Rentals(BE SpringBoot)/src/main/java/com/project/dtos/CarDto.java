package com.project.dtos;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class CarDto {

    private Long id;

    private String name;

    private String color;

    private String transmission;

    private String brand;

    private String type;

    private String modelYear;

    private Integer price;

    private String employee;

    private String dealership;

    private String description;

    private MultipartFile image;

    private byte[] returnedImage;

}

