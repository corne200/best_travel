package com.example.best_travel.api.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.best_travel.util.enums.AeroLine;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FlyResponse implements Serializable {
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinyLat;
    private Double destinyLng;
    private String originName;
    private String destinyName;
    private BigDecimal price;
    private AeroLine aeroLine;
}
