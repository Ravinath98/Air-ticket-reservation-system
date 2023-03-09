package com.dsproject.airticket.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlaneResponse {

    private String id;
    private String departure;
    private String destination;
    private String arrival_time;
    private String duration;
    private String seats;

}

//product request & product response act as the data transfer objects..
