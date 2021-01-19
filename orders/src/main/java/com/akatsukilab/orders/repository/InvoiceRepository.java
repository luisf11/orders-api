package com.akatsukilab.orders.repository;

import com.akatsukilab.orders.models.Invoice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository  extends MongoRepository<Invoice,String>{
    
}
