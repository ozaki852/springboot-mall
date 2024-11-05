package com.mall.springbootmall.service;

import com.mall.springbootmall.dto.CreateOrderRequest;
import com.mall.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
