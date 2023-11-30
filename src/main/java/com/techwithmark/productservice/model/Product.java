package com.techwithmark.productservice.model;

// Lombok annotations to generate the getters and setters.

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product") // Document annotation
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Product {
    @Id // This is to specify that this is a unique identifier for the product.
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
