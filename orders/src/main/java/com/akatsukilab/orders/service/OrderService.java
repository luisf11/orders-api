package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Order;

public interface OrderService {

    public List<Order> getOrders();

    public  Optional<Order> getOrder(String orderId);

    public void saveOrder(Order order);

    public void deleteOrder(String orderId);

    public Order editOrder(String orderId,Order order);
    
}
