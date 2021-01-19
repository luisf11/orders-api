package com.akatsukilab.orders.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Product;
import com.akatsukilab.orders.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
Product product1 = new Product("product 1", "1", "this is the product 1", "desert", "120.00", "comment for product 1", "toSell", new Date());
Product product2 = new Product("product 2", "2", "this is the product 2", "desert", "120.00", "comment for product 2", "toSell", new Date());

productRepository.save(product1);
productRepository.save(product2);
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(String productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product editProduct(String productId ,Product product) {
        Product productToEdit = productRepository.findById(productId).orElse(null);
        productToEdit.setCategory(product.getCategory());
        productToEdit.setComments(product.getComments());
        productToEdit.setDescription(product.getDescription());
        productToEdit.setName(product.getName());
        productToEdit.setPrice(product.getPrice());
        productToEdit.setCategory(product.getCategory());

        return productRepository.save(productToEdit);
    }

}
