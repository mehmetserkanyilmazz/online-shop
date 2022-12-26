package com.shopping.syshoppingapp.product.repository.mongo;

import com.shopping.syshoppingapp.product.domian.Product;
import com.shopping.syshoppingapp.product.domian.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice,String> {
}
