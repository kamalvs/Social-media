package com.training.sm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
public class SocialMedia {
    private String platform;
    private String contentType;
    private String Domain;
    private LocalDate date;

}