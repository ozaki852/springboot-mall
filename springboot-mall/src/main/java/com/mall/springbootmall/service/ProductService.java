package com.mall.springbootmall.service;

import com.mall.springbootmall.constant.ProductCategory;
import com.mall.springbootmall.dto.ProductRequest;
import com.mall.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
