package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Product;

public interface ProductService {
    
    public List<Product> getProducts();

    public  Optional<Product> getProduct(String productId);

    public void saveProduct(Product product);

    public void deleteProduct(String productId);

    public Product editProduct(String productId ,Product product);
}
