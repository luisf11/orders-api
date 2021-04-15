package com.akatsukilab.orders.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Order;
import com.akatsukilab.orders.models.Product;
import com.akatsukilab.orders.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public List<Order> getOrders() {

        Order order1 = new Order();
        order1.setOrderID("1");
        order1.setCreationDate(new Date());
        Product product1 = new Product("product 1", "1", "this is the product 1", "desert", "120.00",
                "comment for product 1", "toSell", new Date());
        Product product2 = new Product("product 2", "2", "this is the product 2", "desert", "120.00",
                "comment for product 2", "toSell", new Date());
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        order1.setProductList(productList);
        order1.setStatus("open");
        order1.setTotalAmmount("100.00");
        order1.setComments(" sauce on side");

        ordersRepository.save(order1);
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
    public Order editOrder(String orderid, Order order) {
        Order orderToEdit = ordersRepository.findById(orderid).orElse(null);
        orderToEdit.setComments(order.getComments());
        orderToEdit.setProductList(order.getProductList());
        orderToEdit.setStatus(order.getStatus());
        orderToEdit.setTotalAmmount(order.getTotalAmmount());
        orderToEdit.setProductList(order.getProductList());
        return ordersRepository.save(orderToEdit);
    }

}
