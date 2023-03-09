package com.dsproject.airticket.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value="plane")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Plane {
    @Id
    private String id;
    private String departure;
    private String destination;
    private String arrival_time;
    private String duration;
    private String seats;
}
