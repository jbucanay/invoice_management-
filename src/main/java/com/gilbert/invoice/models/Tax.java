package com.gilbert.invoice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tax")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taxCode;
//    @Column(nullable = false)
    private Double rate;

}
