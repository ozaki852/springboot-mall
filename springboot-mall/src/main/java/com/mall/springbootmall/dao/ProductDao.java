package com.mall.springbootmall.dao;

import com.mall.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
