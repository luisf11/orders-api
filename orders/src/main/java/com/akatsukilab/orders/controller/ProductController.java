package com.akatsukilab.orders.controller;

import com.akatsukilab.orders.models.Product;
import com.akatsukilab.orders.service.ProductService;

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
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("products")
    public ResponseEntity<?> getproducts() {


        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("products/{id}")
    public ResponseEntity<?> getproduct(@PathVariable("id") String id) {


        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @PostMapping("products")
    public ResponseEntity<?> saveproduct(@RequestBody Product product) {
        productService.saveProduct(product);

        return new ResponseEntity<>("product saved", HttpStatus.OK);
    }
    
    @PutMapping("products/{id}")
    public ResponseEntity<?> editproduct(@PathVariable("id") String id,@RequestBody Product product) {


        return new ResponseEntity<>(productService.editProduct(id, product), HttpStatus.OK);
    }
}
