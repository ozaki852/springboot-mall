package com.mall.springbootmall.dao;

import com.mall.springbootmall.dto.ProductRequest;
import com.mall.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
