package com.akatsukilab.orders.controller;

import com.akatsukilab.orders.models.Order;
import com.akatsukilab.orders.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("orders")
    public ResponseEntity<?> getOrders() {


        return new ResponseEntity<>(orderService.getOrders(), HttpStatus.OK);
    }

    @GetMapping("orders/{id}")
    public ResponseEntity<?> getOrder(@PathVariable("id") String id) {


        return new ResponseEntity<>(orderService.getOrder(id), HttpStatus.OK);
    }

    @PostMapping("Orders")
    public ResponseEntity<?> saveOrder(@RequestBody Order order) {
        orderService.saveOrder(order);

        return new ResponseEntity<>("Order saved", HttpStatus.OK);
    }
    
    @PutMapping("Orders/{id}")
    public ResponseEntity<?> editOrder(@PathVariable("id") String id,@RequestBody Order order) {


        return new ResponseEntity<>(orderService.editOrder(id, order), HttpStatus.OK);
    }
}
