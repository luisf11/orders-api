package com.akatsukilab.orders.controller;
import com.akatsukilab.orders.models.Invoice;
import com.akatsukilab.orders.service.InvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * InvoiceController
 */
@Controller
public class InvoiceController {
 @Autowired
 InvoiceService invoiceService;

 @GetMapping("invoices")
 public ResponseEntity<?> getInvoices() {


     return new ResponseEntity<>(invoiceService.getInvoices(), HttpStatus.OK);
 }

 @GetMapping("invoices/{id}")
 public ResponseEntity<?> getInvoice(@PathVariable("id") String id) {


     return new ResponseEntity<>(invoiceService.getInvoice(id), HttpStatus.OK);
 }

 @PostMapping("invoices")
 public ResponseEntity<?> saveInvoice(@RequestBody Invoice Invoice) {
     invoiceService.saveInvoice(Invoice);

     return new ResponseEntity<>("Invoice saved", HttpStatus.OK);
 }
 
 @PutMapping("invoices/{id}")
 public ResponseEntity<?> editInvoice(@PathVariable("id") String id,@RequestBody Invoice Invoice) {


     return new ResponseEntity<>(invoiceService.editInvoice(id, Invoice), HttpStatus.OK);
 }
    
}