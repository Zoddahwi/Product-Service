package com.victorwiseactive.productservice.repository;

import com.victorwiseactive.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
