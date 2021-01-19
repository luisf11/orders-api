package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Order;
import com.akatsukilab.orders.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public List<Order> getOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Optional<Order> getOrder(String orderId) {
        return ordersRepository.findById(orderId);
    }

    @Override
    public void saveOrder(Order order) {
ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(String orderId) {
      ordersRepository.deleteById(orderId);

    }

    @Override
    public Order editOrder(String orderid,Order order) {
        Order orderToEdit = ordersRepository.findById(orderid).orElse(null);
        orderToEdit.setComments(order.getComments());
        orderToEdit.setProductList(order.getProductList());
        orderToEdit.setStatus(order.getStatus());
        orderToEdit.setTotalAmmount(order.getTotalAmmount());
        orderToEdit.setProductList(order.getProductList());
        return ordersRepository.save(orderToEdit);
    }
    
}
