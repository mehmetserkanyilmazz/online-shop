package com.shopping.syshoppingapp.product.domian;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//mongodaki collectionuma denk gelecek.
//bütün veri tabanıyla olan işlemleri burda yapcam
@Document("product")  // mongo db üzerindeki collection adı
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;
    private String features;
    private String categoryId;
    private boolean active;
    private List<ProductImage> productImage;




}
