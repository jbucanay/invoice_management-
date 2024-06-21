package com.gilbert.invoice.controllers;

import com.gilbert.invoice.models.Invoice;
import com.gilbert.invoice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping
    public Invoice saveAnInvoice(@RequestBody Invoice invoice){
        return invoiceService.createInvoice(invoice);
    }
}
