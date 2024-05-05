package com.project.dtos;
import lombok.Data;

import java.util.Date;

import com.project.enums.BookCarStatus;

@Data
public class BookACarDto {

    private Long id;

    private Date fromDate;

    private Date toDate;

    private Long days;

    private Long amount;

    private BookCarStatus bookCarStatus;

    private Long userId;

    private String email;

    private String username;
    
    private String employee;
    
    private String dealership;

}

