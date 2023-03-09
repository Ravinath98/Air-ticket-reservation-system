package com.dsproject.airticket.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PlaneRequest {
    private String departure;
    private String destination;
    private String arrival_time;
    private String duration;
    private String seats;
}
