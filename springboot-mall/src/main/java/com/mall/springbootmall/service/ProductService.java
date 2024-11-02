package com.mall.springbootmall.service;

import com.mall.springbootmall.dto.ProductRequest;
import com.mall.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
