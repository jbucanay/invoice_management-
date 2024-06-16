package com.gilbert.invoice.models;

import jakarta.persistence.*;

@Entity
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taxCode;
    @Column(nullable = false)
    private Double taxRate;
}
