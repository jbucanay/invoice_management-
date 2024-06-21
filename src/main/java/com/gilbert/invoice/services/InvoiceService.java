package com.gilbert.invoice.services;

import com.gilbert.invoice.models.Invoice;
import com.gilbert.invoice.models.InvoiceDetail;
import com.gilbert.invoice.repositories.InvoiceDetailRepo;
import com.gilbert.invoice.repositories.InvoiceRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InvoiceService {
    @Autowired
    private InvoiceRepo invoiceRepo;
    @Autowired
    private  InvoiceDetailRepo invoiceDetailRepo;

    public Invoice createInvoice(Invoice invoice){
        System.out.println(invoice.getCustomer().toString());
        System.out.println(invoice.getCustomer().getState().toString());
        return invoiceRepo.save(invoice);
    }

    public InvoiceDetail createInvoiceDetail(InvoiceDetail invoiceDetail){
        return invoiceDetailRepo.save(invoiceDetail);
    }

}
