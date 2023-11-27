package com.techwithmark.productservice.repository;

import com.techwithmark.productservice.model.Product;
//To define this product as a MongoDB document.
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
