package com.mall.springbootmall.service;

import com.mall.springbootmall.dto.CreateOrderRequest;
import com.mall.springbootmall.dto.OrderQueryParams;
import com.mall.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
