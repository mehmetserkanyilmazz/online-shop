package com.shopping.syshoppingapp.repository.es;

import com.shopping.syshoppingapp.product.domian.es.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs,String> {

}
