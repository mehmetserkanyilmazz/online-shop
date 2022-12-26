package com.shopping.syshoppingapp.product.repository.mongo;

import com.shopping.syshoppingapp.product.domian.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {


}
