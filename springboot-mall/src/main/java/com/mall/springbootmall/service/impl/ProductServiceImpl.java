package com.mall.springbootmall.service.impl;

import com.mall.springbootmall.dao.ProductDao;
import com.mall.springbootmall.model.Product;
import com.mall.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
