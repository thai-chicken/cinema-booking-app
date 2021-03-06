package com.thaichicken.cinemabooking.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class ShowTimeDTO {
    private Integer showtimeId; //Integer
    private Date date;
    private Time hour;
    private Integer movieId;
    private String name;
    private String description;
    private Integer length;
    private Integer productionYear;
    private String type;
    private String director;
    private Integer cinemaHallNumber;
}
