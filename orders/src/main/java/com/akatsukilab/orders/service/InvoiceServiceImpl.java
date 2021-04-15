package com.akatsukilab.orders.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Invoice;
import com.akatsukilab.orders.repository.InvoiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InvoiceServiceImpl implements InvoiceService {


    @Autowired
    InvoiceRepository invoiceRepository;
    @Override
    public List<Invoice> getInvoices() {

        Invoice invoice = new Invoice();

        invoice.setDate(new Date());
        invoice.setInvoiceId("1");
        invoice.setOrderId("1");
        invoice.setStatus("open");
        invoice.setTotalAmmount("100.00");
        invoice.setUserName("luis");
        invoiceRepository.save(invoice);
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> getInvoice(String invoiceId) {
        return invoiceRepository.findById(invoiceId);
    }

    @Override
    public void saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);

    }

    @Override
    public void deleteInvoice(String invoiceId) {
        invoiceRepository.deleteById(invoiceId);

    }

    @Override
    public Invoice editInvoice(String invoiceId,Invoice invoice) {
        Invoice invoiceToEdit = invoiceRepository.findById(invoiceId).orElse(null);
        invoiceToEdit.setDate(invoice.getDate());
        invoiceToEdit.setStatus(invoice.getStatus());
        invoiceToEdit.setTotalAmmount(invoice.getTotalAmmount());
        invoiceToEdit.setUserName(invoice.getUserName());
        invoiceToEdit.setOrderId(invoice.getOrderId());
        
//add logic to edit order here
        return invoiceRepository.save(invoiceToEdit);
    }
    
}

