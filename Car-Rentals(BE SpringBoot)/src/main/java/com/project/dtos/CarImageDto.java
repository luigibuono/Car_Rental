package com.project.dtos;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class CarImageDto {
	
	private Long id;

    private MultipartFile image;

    private byte[] returnedImage;

}