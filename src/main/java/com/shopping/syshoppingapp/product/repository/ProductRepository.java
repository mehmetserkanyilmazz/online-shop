package com.shopping.syshoppingapp.product.repository;

import com.shopping.syshoppingapp.product.domian.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {


}
