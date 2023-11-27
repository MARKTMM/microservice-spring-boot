package com.techwithmark.productservice.dto;

// Lombok annotations to generate the getters and setters.
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
