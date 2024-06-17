package com.gilbert.invoice.models;

import jakarta.persistence.*;

@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = "stateName",
                        name = "state_name_unique"
                )
        }
)
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stateId;
    @Column(nullable = false)
    private String stateName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_code")
    private Tax tax;
}
