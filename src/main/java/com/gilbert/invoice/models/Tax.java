package com.gilbert.invoice.models;

import jakarta.persistence.*;

@Entity
public class Tax {
    @Id
    private Long taxCode;
    @Column(nullable = false)
    private Double taxRate;
}
