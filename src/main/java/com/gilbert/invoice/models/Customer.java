package com.gilbert.invoice.models;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                )
        }
)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String email;
    private String address;
    private String city;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id")
    private State state;
    @Column(length = 10)
    private String zipCode;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
