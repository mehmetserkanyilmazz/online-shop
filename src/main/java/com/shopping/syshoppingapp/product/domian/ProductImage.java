package com.shopping.syshoppingapp.product.domian;

import javax.imageio.ImageTypeSpecifier;

public class ProductImage {

    private ImageType imageType;
    private String url;

    enum ImageType{
    FEATURE,NORMAL;
    }

}
