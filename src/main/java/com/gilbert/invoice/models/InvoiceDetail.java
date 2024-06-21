package com.gilbert.invoice.models;

import jakarta.persistence.*;

@Entity
public class InvoiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceDetailId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id", nullable = false)
    private Invoice invoice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    private int quantity;
    private Double unitPrice;
    private Double lineTotal;
}
