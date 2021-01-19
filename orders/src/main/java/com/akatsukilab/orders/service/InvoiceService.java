package com.akatsukilab.orders.service;

import java.util.List;
import java.util.Optional;

import com.akatsukilab.orders.models.Invoice;

public interface InvoiceService {
    public List<Invoice> getInvoices();

    public  Optional<Invoice> getInvoice(String invoiceId);

    public void saveInvoice(Invoice invoice);

    public void deleteInvoice(String invoiceId);

    public Invoice editInvoice(String invoiceId,Invoice invoice);
}
