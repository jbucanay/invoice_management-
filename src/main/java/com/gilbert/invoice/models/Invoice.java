package com.gilbert.invoice.models;

import com.gilbert.invoice.InvoiceStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Invoice {
    @Id
    private Long invoiceId;
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;
    private LocalDateTime invoiceDate;
    private Double totalAmount;
    @OneToOne
    @JoinColumn(name = "tax_code")
    private Tax tax;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InvoiceStatus status = InvoiceStatus.OPEN;

}
