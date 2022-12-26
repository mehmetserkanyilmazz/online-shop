package com.shopping.syshoppingapp.product.service;

import com.shopping.syshoppingapp.product.model.ProductResponse;
import com.shopping.syshoppingapp.product.model.ProductSaveRequest;
import com.shopping.syshoppingapp.product.repository.mongo.ProductRepository;
import com.shopping.syshoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;

import java.awt.print.Pageable;
import java.util.List;

@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;

    List<ProductRepository> getByPaging(Pageable pageable){
        // 1 - ES den sorgula
        // 2 - Calc fieltları işle
        // 3 - redisten ihtiyac olanları getir
        // 4 - response nesnesine donustur.


        return null;
    }

    ProductResponse save (ProductSaveRequest productSaveRequest){
        // 1 - mongoya yaz
        // 2 - ES guncelle
        // 3 - Redis guncelle
        // 4 - ES den cevap dön
        // 5 - response nesnesini olustur.


        return null;
    }

}
